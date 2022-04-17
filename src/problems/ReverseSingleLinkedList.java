/**
 * 
 */
package problems;

import data_structures.BasicSingleLinkedList;
import data_structures.BasicSingleLinkedList.Node;
/**
 * @author ajkumar
 *
 */
public class ReverseSingleLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicSingleLinkedList<Integer> sampleList = new BasicSingleLinkedList<Integer>();
		sampleList.add(1);
		sampleList.add(2);
		sampleList.add(3);
		//sampleList.add(4);
		//sampleList.add(5);
		//sampleList.add(6);
		//sampleList.add(7);
		
		System.out.println("Linked List : "+ sampleList);
		
		Node head = reverseList(sampleList.getHead()); 
		System.out.print("Reverse Linked List : ");
		printList(head);
		
		
		System.out.println("\nReverse Between 3 & 5 : ");
		Node revHead = reverseBetween(head, 1, 2);
		printList(revHead);
	}
	
	public static Node reverseList(Node head) {
		
		if( head == null || head.getNext() == null )
			return head;
		
		Node current = head;
		Node prev = null;
		while( current != null ) {
			Node next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		
		return prev;
	}
	
	public static Node reverseBetween(Node head, int left, int right) {
        
        if( head == null || head.getNext() == null || left == right ){
            return head;
        }
        
        Node current = head;
        int currNodePos = 1;
        Node preStartReverse = head;
        
        while(currNodePos < left) {
        	preStartReverse = current;
        	current = current.getNext();
        	currNodePos++;
        }
        
        Node prev = null, tail = current;
        while( currNodePos >= left && currNodePos <= right ) {
        	Node next = current.getNext();
        	current.setNext(prev);
        	prev = current;
        	current = next;
        	currNodePos++;
        }
        
        preStartReverse.setNext(prev);
        tail.setNext(current);
        
        if( left > 1)
        	return head;
        else
        	return prev;
    }
	
	static void printList(Node head) {
		while(head != null) {
			System.out.print(head.getItem());
			if( head.getNext() != null ) {
				System.out.print("-->");
			}
			head = head.getNext();
		}
	}

}
