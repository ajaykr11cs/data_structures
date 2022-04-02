/**
 * 
 */
package sortingAlgorithms;

/**
 * @author ajkumar
 *
 */
public class SelectionSort {
	
	public int[] sort(int[] input) {
		
		if( input.length < 2 ) {
			return input;  
		}
		
		int length = input.length;
		for( int i=0; i< length-1; i++) {
			int minIndex = i;
			for(int j=i+1; j< length; j++) {
				if( input[j] < input[minIndex] ) {
					minIndex = j;
				}
			}
			//Swapping the minimum element with ith element
			int temp = input[i];
			input[i] = input[minIndex];
			input[minIndex] = temp;
		}
		
		return input;
	}

}
