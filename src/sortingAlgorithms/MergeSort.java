/**
 * 
 */
package sortingAlgorithms;

/**
 * @author ajkumar
 *
 */
public class MergeSort {
	
	public void sort(int[] input, int start, int end) {
		
		//System.out.println(" start: "+ start+", end:"+ end);
		if( start < end ) {

			int midElement = (int) Math.floor((start + end)/2);
			sort(input, start, midElement);
			sort(input, midElement+1, end);
			
			merge( input, start, midElement, end);
		}
		
	}
	
	void merge(int[] input, int start, int mid, int end) {
		
		//System.out.println(" Merge function called!, start: "+ start+", mid: "+ mid+", end: "+end);
		int firstHalfSize = mid-start+1;
		int secondHalfSize = end - mid;
		
		int[] firstHalf = new int[firstHalfSize];
		int[] secondHalf = new int[secondHalfSize];
		
		for( int i=0; i< firstHalfSize; i++) {
			firstHalf[i] = input[start + i];
		}

		for( int j=0; j< secondHalfSize; j++) {
			secondHalf[j] = input[mid+j+1];
		}
			
		int firstIndex = 0, secondIndex=0;
		int index = start;
		
		//printArray(input);
		
		while( firstIndex < firstHalfSize
				&& secondIndex < secondHalfSize) {
			if( firstHalf[firstIndex] < secondHalf[secondIndex]) {
				input[index++] = firstHalf[firstIndex];
				firstIndex++;
			}else {
				input[index++] = secondHalf[secondIndex];
				secondIndex++;
			}
		}
		
		while( firstIndex < firstHalfSize) {
			input[index++] = firstHalf[firstIndex++];
		}
		
		while( secondIndex < secondHalfSize) {
			input[index++] = secondHalf[secondIndex++];
		}
		
		
		//printArray(input);
	}
	

	private static void printArray(int[] input) {
		for( int i=0; i< input.length;i++) {
			System.out.print(input[i]);
			if( i < input.length-1 )
				System.out.print(",");
		}
		System.out.println();
	}

}
