/**
 * 
 */
package sortingAlgorithms;

/**
 * @author ajkumar
 *
 */
public class QuickSort {
	
	public void sort(int[] input, int start, int end) {
		if( start < end ) {
			int partitionIndex = partition(input, start, end);
			
			sort(input, start, partitionIndex-1);
			sort(input, partitionIndex+1, end);
		}
	}

	int partition(int[] input, int start, int end) {
		//System.out.println(" Partition : start="+start+", end="+end);
		int pivot = input[end];
		int partitionIndex = start;
		for(int i=start; i<end;i++) {
			if( input[i] <= pivot ) {
				swap( input, i, partitionIndex);
				partitionIndex++;
			}
		}
		
		swap(input, partitionIndex, end);
		return partitionIndex;
	}
	
	void swap(int[] input, int first, int second) {
		//System.out.println("Swap : positions - "+first+", "+second);
		int temp = input[first];
		input[first] = input[second];
		input[second] = temp;
	}
}
