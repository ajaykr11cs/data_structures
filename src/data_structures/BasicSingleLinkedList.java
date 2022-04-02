/**
 * 
 */
package data_structures;

/**
 * @author ajkumar
 *
 */
public class BasicSingleLinkedList<X> {
	
	Node head;
	int nodeCount;
	
	public BasicSingleLinkedList() {
		this.head = null;
		this.nodeCount = 0;
	}
	
	public BasicSingleLinkedList(X item) {
		this.head = new Node(item);
		this.nodeCount = 1;
	}

	public int getSize() {
		return this.nodeCount;
	}
	
	public X add(X item) {
		
		Node newNode = new Node(item);
		//To add the first Item and handle the case where already elements are present; adding at the start of the linked list
		Node currNode = this.head;
		newNode.setNextNode(currNode);
		this.head = newNode;
		
		this.nodeCount++;
		return this.head.item;
	}
	
	public X addAtEnd(X item) {
		
		Node newNode = new Node(item);
		Node currNode = this.head;
		if( currNode == null ) {
			currNode = newNode;
		}else {
			while( currNode.next != null ) {
				currNode = currNode.next;
			}
			currNode.setNextNode(newNode);
		}
		
		this.nodeCount++;
		
		return newNode.item;
	}
	
	
	public X add(X item, int position) {
		
		if( position < 0 
				|| position > (this.nodeCount+1)) {
			return null;
		}
		
		if( position == 0 ) {
			add(item);
		}else {
			
			Node newNode = new Node(item);
			Node currNode = this.head;
			Node prevNode = null;
			while( position > 0 ) {
				prevNode = currNode;
				currNode = currNode.next;
				position--;
			}
			
			prevNode.setNextNode(newNode);
			newNode.setNextNode(currNode);
			
			this.nodeCount++;
			
		}
		return item;
	}
	
	public X remove(int index) {
		if( index < 0 
				|| index > getSize()) {
			return null;
		}
		
		Node currNode = this.head;
		Node prevNode = null;
		while(index>0) {
			prevNode = currNode;
			currNode = currNode.next;
			index--;
		}
		
		//deletion process
		prevNode.setNextNode(currNode.next);
		this.nodeCount--;
		
		return currNode.item;
	}

	
	public int remove(X object) {

		int index = -1;
		if(this.head == null
				|| object == null) {
			return index;
		}
		
		if( this.head.item == object ) {
			this.head = this.head.next;
			this.nodeCount--;
			index++;
			return index;
		}
		
		Node currNode = this.head.next;
		Node prevNode = this.head;
		index = 1;
		
		while(currNode != null) {
			if( currNode.item.equals(object)) {
				prevNode.setNextNode(currNode.next);
				this.nodeCount--;
				return index;
			}
			prevNode = currNode;
			currNode = currNode.next;
			index++;
		}
		
		return index;
	}
	
	public Node reverse(){
		if( this.head == null 
				|| getSize() < 2 ) {
			return this.head;
		}
		
		Node currNode = this.head;
		Node prevNode = null;
		Node nextNode = null;
		while( currNode != null ) {
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		currNode = prevNode;
		this.head = currNode;

		return currNode;
	}
	
	@Override
	public String toString() {
		StringBuffer basicLL = new StringBuffer();
		Node headNode = this.head;
		while( headNode != null ) {
			basicLL.append(headNode.item);
			if( headNode.next != null )
				basicLL.append("-->");
			headNode = headNode.next;
		}
		return basicLL.toString();
	}
	
	
	
	
	
	
	private class Node{
		
		X item;
		Node next;
		
		public Node(X item) {
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
