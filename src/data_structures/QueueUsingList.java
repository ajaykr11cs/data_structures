/**
 * 
 */
package data_structures;

/**
 * @author ajkumar
 *
 */
public class QueueUsingList<X> {

	Node first;
	Node last;
	int length;
	
	public QueueUsingList() {
		this.first = null;
		this.last = null;
		this.length = 0;
	}
	
	public Node enqueue(X item) {
		Node newNode = new Node(item);
		if( this.length == 0 ) {
			this.first = newNode;
			this.last = newNode;
		}
		else {
			this.last.next = newNode;
			this.last = newNode;
		}
		
		this.length++;
		return this.last;
	}
	
	public Node dequeue() {
		if( this.length == 0 ) {
			System.out.println("Empty Queue!!!");
			return this.first;
		}
		
		if( this.length == 1) {
			this.last = null;
		}
		
		Node tempNode = this.first;
		this.first = this.first.next;
		
		this.length--;
		
		return tempNode;
	}
	
	public X peek() {
		if(this.length == 0 ) {
			System.out.println("Empty Queue!!!");
			return null;
		}
		
		return this.first.item;
	}
	
	public int size() {
		return this.length;
	}
	
	public boolean isEmpty() {
		return this.length == 0 ? true: false;
	}
	
	public String toString() {
		StringBuffer queueList = new StringBuffer();
		Node tempNode = this.first;
		while(tempNode != null) {
			queueList.append(tempNode.item);
			if( tempNode.next != null ) {
				queueList.append("<--");
			}
			tempNode = tempNode.next;
		}
		return queueList.toString();
	}
	
	
	class Node{
		
		X item;
		Node next;
		
		public Node(X value) {
			this.item = value;
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
