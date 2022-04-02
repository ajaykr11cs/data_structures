/**
 * 
 */
package testing;

import data_structures.BasicDoublyLinkedList;
import data_structures.BasicSingleLinkedList;

/**
 * @author ajkumar
 *
 */
public class TestingLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		System.out.println("****************** Testing Singly Linked list ********************* ");
		BasicSingleLinkedList<Integer> basicLinkedList = new BasicSingleLinkedList<Integer>();
		System.out.println("Basic Linked List: "+ basicLinkedList.toString());
		System.out.println("Basic Linked List Size: "+ basicLinkedList.getSize());
		
		basicLinkedList.add(5);
		System.out.println("Basic Linked List: "+ basicLinkedList.toString());
		System.out.println("Basic Linked List Size: "+ basicLinkedList.getSize());
		
		basicLinkedList.add(10);
		System.out.println("Basic Linked List: "+ basicLinkedList.toString());
		basicLinkedList.add(3);
		System.out.println("Basic Linked List: "+ basicLinkedList.toString());
		basicLinkedList.add(7);
		
		System.out.println("Basic Linked List: "+ basicLinkedList.toString());
		System.out.println("Basic Linked List Size: "+ basicLinkedList.getSize());
		
		basicLinkedList.addAtEnd(13);
		
		System.out.println("Basic Linked List: "+ basicLinkedList.toString());
		System.out.println("Basic Linked List Size: "+ basicLinkedList.getSize());
		
		basicLinkedList.add(17, 5);
		
		basicLinkedList.remove(2);
		System.out.println("Basic Linked List: "+ basicLinkedList.toString());
		System.out.println("Basic Linked List Size: "+ basicLinkedList.getSize());
		
		basicLinkedList.add(11, 1);
		
		System.out.println("Basic Linked List: "+ basicLinkedList.toString());
		System.out.println("Basic Linked List Size: "+ basicLinkedList.getSize());
		
		System.out.println("Element removed at index: "+basicLinkedList.remove(new Integer(13)));
		
		System.out.println("Basic Linked List: "+ basicLinkedList.toString());
		System.out.println("Basic Linked List Size: "+ basicLinkedList.getSize());
		
		basicLinkedList.reverse();
		
		System.out.println("***************Post reverse of Linked List*****************");
		System.out.println("Basic Linked List Reversed: "+ basicLinkedList.toString());
		System.out.println("Basic Linked List Size: "+ basicLinkedList.getSize());
		
		System.out.println("*************** Testing Doubly Linked List *****************");
		
		BasicDoublyLinkedList<Integer> doublyLL = new BasicDoublyLinkedList<Integer>();
		doublyLL.add(5);
		System.out.println("Doubly Linked List: "+ doublyLL.toString());
		System.out.println("Doubly Linked List Size: "+ doublyLL.size());
		doublyLL.add(6);
		doublyLL.add(9);
		
		System.out.println("Doubly Linked List: "+ doublyLL.toString());
		System.out.println("Doubly Linked List Size: "+ doublyLL.size());
		
		doublyLL.add(11, 2);
		doublyLL.add(13, 1);
		
		System.out.println("Doubly Linked List: "+ doublyLL.toString());
		System.out.println("Doubly Linked List Size: "+ doublyLL.size());
		
		doublyLL.remove(10);
		doublyLL.remove(2);
		
		
		System.out.println("Doubly Linked List: "+ doublyLL.toString());
		System.out.println("Doubly Linked List Size: "+ doublyLL.size());
		
		System.out.println("Element at index "+ doublyLL.findFromStart(5));
		System.out.println("Element at index "+ doublyLL.findFromEnd(5));
	}

}
