package data_structures;

import data_structures.BasicDoublyLinkedList.Node;

public class MultiLevelDoublyLinkedList<X> {

	private int length;
	private Node head;
	private Node tail;

	public MultiLevelDoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	public Node getHead() {
		return this.head;
	}

	public Node getTail() {
		return this.tail;
	}

	// Add element operation at start
	public Node add(X item) {

		Node newNode = new Node(item);
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;

		} else {
			Node headNode = this.head;
			newNode.setNextNode(this.head);
			headNode.setPreviousNode(newNode);
			this.head = newNode;
		}
		this.length++;
		return this.head;
	}

	// Add element operation at start
	public Node add(X item, Node child) {

		Node newNode = new Node(item, child);
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;

		} else {
			Node headNode = this.head;
			newNode.setNextNode(this.head);
			headNode.setPreviousNode(newNode);
			this.head = newNode;
		}
		this.length++;
		return this.head;
	}

	public class Node {

		X item;
		Node next;
		Node previous;
		Node child;

		public Node(X item) {
			this.item = item;
			this.next = null;
			this.previous = null;
			this.child = null;
		}
		
		public Node(X item, Node child) {
			this.item = item;
			this.next = null;
			this.previous = null;
			this.child = child;
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

		public Node getChildNode() {
			return this.child;
		}

		public void setNextNode(Node newNextNode) {
			this.next = newNextNode;
		}

		public void setPreviousNode(Node newPreviousNode) {
			this.previous = newPreviousNode;
		}

		public void setChildNode(Node newChildNode) {
			this.child = newChildNode;
		}
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
}
