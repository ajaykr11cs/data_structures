/**
 * 
 */
package sortingAlgorithms;

/**
 * @author ajkumar
 *
 */
public class InsertionSort {
	
	public int[] sort(int[] input) {
		
		if( input.length < 2 ) {
			return input;
		}
		
		int length = input.length;
		for(int i=1; i< length; i++) {
			int key = input[i];
			int j = i-1;
			
			while( j>=0 && input[j] > key) {
				input[j+1] = input[j];
				j--;
			}
			
			input[j+1] = key;
		}
		
		return input;
	}

}
