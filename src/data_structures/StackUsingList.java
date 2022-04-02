/**
 * 
 */
package data_structures;

/**
 * @author ajkumar
 *
 */
public class StackUsingList<X> {

	Node top;
	Node bottom;
	int length;
	
	public StackUsingList() {
		this.top = null;
		this.bottom = null;
		this.length = 0;
		
	}
	
	public void push(X item) {
		if( item == null)
			return;
		
		Node newNode = new Node(item);
		if( this.top == null ) {
			this.top = newNode;
			this.bottom = newNode;
		}else {
			newNode.next = this.top;
			this.top = newNode;
		}
		
		this.length++;
	}
	
	public Node pop() {
		if( this.length == 0 ) {
			System.out.println("Empty Stack!");
			return null;
		}
		
		if( this.top == this.bottom ) {
			this.bottom = null;
		}
		
		this.top = this.top.getNextNode();
		this.length--;		
		
		return this.top;
	}
	
	public X peek() {
		if( this.length == 0 ) {
			System.out.println("Empty Stack!");
			return null;
		}
		Node topNode = this.top;
		return topNode.item;
	}
	
	public boolean isEmpty() {
		return this.length == 0 ? true : false; 
	}
	
	public int size() {
		return this.length;
	}
	
	public String toString() {
		StringBuffer tempStack = new StringBuffer();
		Node tempTop = this.top;
		while(tempTop != null) {
			tempStack.append(tempTop.item);
			if( tempTop.next != null ) {
				tempStack.append("-->");
			}
			tempTop = tempTop.next;
		}
		return tempStack.toString();
	}
	
	class Node{
		
		X item;
		Node next;
		
		Node(X item){
			this.item = item;
			this.next = null;
		}
		
		public X getItem() {
			return this.item;
		}
		
		public Node getNextNode() {
			return this.next;
		}
		
		public void setNextNode(Node nextNode) {
			this.next = nextNode;
		}
	}
	
}
