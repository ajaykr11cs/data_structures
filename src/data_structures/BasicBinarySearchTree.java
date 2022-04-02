/**
 * 
 */
package data_structures;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ajkumar
 * 
 * This class is developed to create Binary Search Tree. 
 *
 */
public class BasicBinarySearchTree {
	
	Node root;
	
	public BasicBinarySearchTree() {
		this.root = null;
	}
	
	public void insert(int value) {
		
		Node newNode = new Node(value);
		
		if( this.root == null ) {
			this.root = newNode;
			System.out.println("Root Node");
			return;
		}
		
		//Need to compare the value of node and decide whether it should be added in left subtree or right subtree  
		Node currentNode = this.root;
		while( true ) {
			if( value < this.root.value ) {
				//Add it in left subtree
				if( currentNode.left == null ) {
					currentNode.left = newNode;
					return;
				}
				currentNode = currentNode.left;
				System.out.println("Left Subtree");
			}else {
				// Add it in right subtree
				if( currentNode.right == null ) {
					currentNode.right = newNode;
					return;
				}
				currentNode = currentNode.right;
				System.out.println("Right Subtree");
			}
		}
		
	}
	
	public Node lookup(int value) {
		if(this.root == null) {
			System.out.print("Empty Tree!!!");
			return null;
		}
		
		if( value == this.root.value) {                                                                                                                                                                                                            
			return this.root;
		}
		
		Node currentNode = this.root;
		while(currentNode != null) {
			if( value < currentNode.value ) {
				//Traverse Left subtree to find the node
				currentNode = currentNode.left;
			}
			else if( value > currentNode.value){
				//Traverse Right subtree to find the node
				currentNode = currentNode.right;
			}else if( currentNode.value == value ) {
				return currentNode;
			}
		}
		
		return null;
		
	}
	
	public void remove(int value) {
		if(this.root == null) {
			System.out.print("Empty Tree!!!");
			return;
		}
		
		Node currentNode = this.root;
		Node parentNode = null;
		//Need to find the node with provided value 
		while(currentNode != null) {
			if( value < currentNode.value ) {
				parentNode = currentNode;
				currentNode = currentNode.left;
			}else if( value > currentNode.value) {
				parentNode = currentNode;
				currentNode = currentNode.right;
			}
			else if( value == currentNode.value ) {				
				//Option 1: No right Child: Bypass the currentNode
				if( currentNode.right == null ) {
					
					if( parentNode == null) {
						//Case for root node
						this.root = currentNode.left;
					}else {					
						// We need to handle the left and right child cases depending on the value comparison between parentNode and currentNode
						if( currentNode.value < parentNode.value) {
							parentNode.left = currentNode.left;
						}
						if( currentNode.value > parentNode.value) {
							parentNode.right = currentNode.left;
						}
					}
				}
				
				//Option 2: Right child which doesn't have a left child
				if( currentNode.right != null 
						&& currentNode.right.left == null) {
					if( parentNode == null) {
						//Case for root node
						this.root = currentNode.left;
					}else {
						currentNode.right.left = currentNode.left;
						
						if( parentNode.value > currentNode.value ) {
							parentNode.left = currentNode.right;
						}
						else if ( parentNode.value < currentNode.value ) {
							parentNode.right = currentNode.right;
						}
					}
				}
				
				//Option 3: Right child which has a left child
				if( currentNode.right != null &&
						currentNode.right.left != null) {
					//find the right child's leftmost child
					Node leftMostChild = currentNode.right.left;
					Node leftMostChildParent = currentNode.right;
					while( leftMostChild.left != null ) {
						leftMostChildParent = leftMostChild;
						leftMostChild = leftMostChild.left;
					}
					
					//LeftmostParent's left subtree is leftmost right child.
					leftMostChildParent.left = leftMostChild.right;
					leftMostChild.left = currentNode.left;
					leftMostChild.right = currentNode.right;
					
					if( parentNode == null ) {
						this.root = leftMostChild;
					}else {
						if( parentNode.value > currentNode.value ) {
							parentNode.left = leftMostChild;
						}
						else if( parentNode.value < currentNode.value ) {
							parentNode.right = leftMostChild;
						}
					}
				}
			}
		}		
	}
	
	public List<Node> breadthFirstSearch() {
		
		if( this.root == null ) {
			return null;
		}
		
		List<Node> bfs = new LinkedList<BasicBinarySearchTree.Node>();
		Queue<Node> queue = new LinkedList<BasicBinarySearchTree.Node>();
		queue.add(this.root);
		while( !queue.isEmpty() ) {
			Node tempNode = (Node)queue.poll();
			bfs.add(tempNode);
			if( tempNode.left != null )
				queue.add(tempNode.left);
			
			if( tempNode.right != null)
				queue.add(tempNode.right);
		}
		
		return bfs;
	}
	
	public class Node{
		
		int value;
		Node left;
		Node right;
		
		public Node(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
		
		public int getValue() {
			return this.value;
		}
		
		public Node getLeftNode() {
			return this.left;
		}
		
		public void setLeftNode(Node leftNode) {
			this.left = leftNode;
		}
		
		public Node getRightNode() {
			return this.right;
		}
		
		public void setRightNode(Node rightNode) {
			this.right = rightNode;
		}
	}

}
