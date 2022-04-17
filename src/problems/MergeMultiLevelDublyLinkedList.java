/**
 * 
 */
package problems;

import data_structures.MultiLevelDoublyLinkedList;
import data_structures.MultiLevelDoublyLinkedList.Node;;

/**
 * @author ajkumar
 *
 */
public class MergeMultiLevelDublyLinkedList<X> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * MultiLevel Doubly Linked List 1 -> 2 -> 3 -> null | 4 -> 5 -> 6 -> null | 7
		 * -> 8 -> 9 -> null
		 */
		MultiLevelDoublyLinkedList<Integer> childL2 = new MultiLevelDoublyLinkedList<Integer>();
		childL2.add(9);
		childL2.add(8);
		childL2.add(7);

		MultiLevelDoublyLinkedList<Integer> childL1 = new MultiLevelDoublyLinkedList<Integer>();
		childL1.add(6);
		childL1.add(5, childL2.getHead());
		childL1.add(4);

		MultiLevelDoublyLinkedList<Integer> mldll = new MultiLevelDoublyLinkedList<Integer>();
		mldll.add(3, childL1.getHead());
		mldll.add(2);
		mldll.add(1);
		
		System.out.println("Double Linked List :" + mldll.toString());
		flatten(mldll.getHead());
		System.out.println("Flattened Double Linked List :" + mldll.toString());
		
		

	}

	public static Node flatten(Node head) {

		if (head == null || (head.getNextNode() == null && head.getChildNode() == null)) {
			return head;
		}

		Node start = head;
		while (start != null) {
			if (start.getChildNode() != null && start.getItem() != null) {
				mergeChild(start, start.getNextNode());
			}
			start.setChildNode(null);
			start = start.getNextNode();
		}
		return head;
	}

	public static void mergeChild(Node start, Node tail) {

		start.setNextNode(start.getChildNode());
		start.getChildNode().setPreviousNode(start);

		Node childStart = start.getChildNode();
		Node prevNode = childStart.getPreviousNode();
		while (childStart != null) {
			if (childStart.getChildNode() != null && childStart.getItem() != null) {
				mergeChild(childStart, childStart.getNextNode());
			}
			childStart.setChildNode(null);
			prevNode = childStart;
			childStart = childStart.getNextNode();
		}

		if (tail != null) {
			prevNode.setNextNode(tail);
			tail.setPreviousNode(prevNode);
		}
	}

}
