/**
 * 
 */
package problems;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author ajkumar
 *
 */
public class KthLargestElement {
	
	public static void main(String[] args) {
		
		int[] input = {10, 2, 76, 45, 90, 63, 25, 45};
		System.out.println(" kth largest element :" +findKthLargestElement(input, 4));
		System.out.println(" kth minimum element :" +findKthMinimumElement(input, 3));
		
	}
	
	static int findKthLargestElement(int[] input, int k) {
		
		if( k == 0 
				|| k > input.length) {
			return -1;
		}
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();// by default creates min-heap
		for(int i=0; i < k; i++) {
			pq.add(input[i]);
		}
		
		for( int j= k; j < input.length; j++ ) {
			if( pq.peek() < input[j] ) {
				pq.poll();
				pq.add(input[j]);
			}
		}
		
		return pq.peek();
	}
	
	static int findKthMinimumElement(int[] input, int k) {
		
		if( k==0 
				|| k > input.length )
			return -1;
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());// to create max-heap
		for(int i=0; i < k; i++) {
			pq.add(input[i]);
		}
		
		for(int j=k; j< input.length; j++) {
			if( pq.peek() > input[j] ) {
				pq.poll();
				pq.add(input[j]);
			}
		}
		
		return pq.peek();
	}

}
