/**
 * 
 */
package sortingAlgorithms;

/**
 * @author ajkumar
 *
 * This class sorts an array of Integers using Bubble Sort
 */
public class BubbleSort {
	
	public int[] sort(int[] input) {
		
		if( input.length <= 1 ) {
			return input;
		}
		
		for(int i=0; i< input.length-1; i++) {
			for(int j=i+1; j< input.length; j++) {
				if(input[i] > input[j]) {
					swap(input, j, i);
				}
			}
		}
		
		return input;
		
	}
	
	private void swap(int[] input, int source, int destination) {
		
		int temp = input[source];
		input[source] = input[destination];
		input[destination] = temp;
	}

}
