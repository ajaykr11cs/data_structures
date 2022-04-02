/**
 * 
 */
package testing;

import java.util.Stack;

import data_structures.QueueUsingList;
import data_structures.StackUsingArray;
import data_structures.StackUsingList;

/**
 * @author ajkumar
 *
 */
public class TestingStackQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StackUsingList<String> websitesVisited = new StackUsingList<String>();
		websitesVisited.push("Google");
		websitesVisited.push("Udemy.com");
		websitesVisited.push("Youtube");
		
		System.out.println("Stack :"+ websitesVisited.toString());
		System.out.println("Stack length: "+ websitesVisited.size());
		System.out.println("Peek() : "+websitesVisited.peek());
		
		websitesVisited.pop();
		System.out.println("Stack popped: "+ websitesVisited.toString());
		System.out.println("Stack length: "+ websitesVisited.size());
		System.out.println("Peek() : "+websitesVisited.peek());

		System.out.println("*****************Stack with Arrays***************");
		StackUsingArray<String> websiteArray = new StackUsingArray<String>();
		websiteArray.push("Google");
		websiteArray.push("udemy");
		websiteArray.push("discord");
		
		System.out.println("Stack : "+ websiteArray.toString());
		System.out.println("Stack Size: "+ websiteArray.size());
		System.out.println("Stack Peek: "+ websiteArray.peek());
		
		websiteArray.pop();
		System.out.println("Stack popped : "+ websiteArray.toString());
		System.out.println("Stack Size: "+ websiteArray.size());
		System.out.println("Stack Peek: "+ websiteArray.peek());
		
		System.out.println("***************** Queues ***************");
		QueueUsingList<String> peopleVisitingOrder = new QueueUsingList<String>();
		peopleVisitingOrder.enqueue("Ram");
		System.out.println("Queue: "+ peopleVisitingOrder.toString());
		peopleVisitingOrder.enqueue("Sita");
		System.out.println("Queue: "+ peopleVisitingOrder.toString());
		peopleVisitingOrder.enqueue("Hanuman");
		
		System.out.println("Queue: "+ peopleVisitingOrder.toString());
		System.out.println("Queue Size: "+ peopleVisitingOrder.size());
		
		peopleVisitingOrder.dequeue();

		System.out.println("Queue Popped: "+ peopleVisitingOrder.toString());
		System.out.println("Queue Size: "+ peopleVisitingOrder.size());
		
		Stack<String> st = new Stack<String>();
		
		
	}

}