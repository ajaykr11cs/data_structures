/**
 * 
 */
package data_structures;

/**
 * @author ajkumar
 *
 */
public class BasicDoublyLinkedList<X> {
	
	private int length;
	private Node head;
	private Node tail;
	
	public BasicDoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	//Add element operation at start
	public Node add(X item) {
		
		Node newNode = new Node(item);
		if(this.head == null) {
			this.head = newNode;
			this.tail = newNode;
			
		}else {
			Node headNode = this.head;
			newNode.setNextNode(this.head);
			headNode.setPreviousNode(newNode);
			this.head = newNode;
		}
		this.length++;
		return this.head;
	}
	
	
	//Add element at an given index
	public Node add(X item, int index) {
		if( index < 0 
				|| index > size()+1) {
			//Invalid index
			return null; 
		}
		
		Node newNode = new Node(item);
		Node prevNode = traverseToIndex(index-1);
		Node nextNode = prevNode.next;
		
		prevNode.setNextNode(newNode);
		newNode.setPreviousNode(prevNode);
		newNode.setNextNode(nextNode);
		nextNode.setPreviousNode(newNode);
		
		this.length++;
		
		return this.head;
	}
	
	//Remove element at a given index
	public void remove(int index) {
		if(index < 0
				|| index > size()) {
			System.out.println("Invalid index provided!!!");
			return;
		}
		
		Node prevNode = traverseToIndex(index-1);
		Node removalNode = prevNode.next;
		Node nextNode = removalNode.next;
		
		prevNode.setNextNode(nextNode);
		nextNode.setPreviousNode(prevNode);
		
		this.length--;
	}
	
	//Search an element from head
	public int findFromStart(X item) {
		
		if( this.head == null
				|| item == null) {
			return -1;
		}
		int index = 0;
		Node currNode = this.head;
		while( currNode != null ) {
			if( currNode.getItem().equals(item)) {
				return index; 
			}
			currNode = currNode.next;
			index++;
		}
		
		return -1;
	}
	
	//Search an element from Tail
		public int findFromEnd(X item) {
			
			if( this.head == null
					|| item == null) {
				return -1;
			}
			
			Node currNode = this.tail;
			int index = size();
			while( currNode != null ) {
				index--;
				if( currNode.getItem().equals(item)) {
					return index; 
				}
				currNode = currNode.previous;			
			}
			
			return -1;
		}
	
	public Node traverseToIndex(int index) {
		
		Node currNode = this.head;

		while( index > 0 ) {
			currNode = currNode.next;
			index--;
		}
		
		return currNode;
	}
	
	
	public int size() {
		return this.length;
	}
	
	public String toString() {
		StringBuffer doublyLinkedList = new StringBuffer();
		Node tempNode = this.head;
		while(tempNode != null) {
			doublyLinkedList.append(tempNode.item);
			if( tempNode.next != null ) {
				doublyLinkedList.append("-->");
			}
			tempNode = tempNode.next;
		}
		
		return doublyLinkedList.toString();
	}
	
	
	private class Node{
		
		X item;
		Node next;
		Node previous;
		
		public Node(X item) {
			this.item = item;
			this.next = null;
			this.previous = null;
		}
		
		public X getItem() {
			return this.item;
		}
		
		public Node getNextNode() {
			return this.next;
		}
		
		public Node getPreviousNode() {
			return this.previous;
		}
		
		public void setNextNode(Node newNextNode) {
			this.next = newNextNode;
		}
		
		public void setPreviousNode(Node newPreviousNode) {
			this.previous = newPreviousNode;
		}
	}
	
}
