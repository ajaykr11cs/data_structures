/**
 * 
 */
package testing;

import sortingAlgorithms.BubbleSort;
import sortingAlgorithms.InsertionSort;
import sortingAlgorithms.MergeSort;
import sortingAlgorithms.QuickSort;
import sortingAlgorithms.SelectionSort;

/**
 * @author ajkumar
 *
 */
public class TestingSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] inputBS = {5, 1, 4, 8, 2, 74, 0, 2};
		int[] inputSS = {64, 25, 12, 22, 11, 152, 0, 12};
		int[] inputIS = {4, 3, 2, 10, 2, 12, 1};
		int[] inputMS = {2, 5, 3, 1, 3};
		int[] inputQS = {28, 15, 34, 11, 3, 5, 3};
		
		BubbleSort bs = new BubbleSort();
		inputBS = bs.sort(inputBS);
		printArray(inputBS);
		
		System.out.println();
		
		SelectionSort ss = new SelectionSort();
		ss.sort(inputSS);
		printArray(inputSS);
		
		System.out.println();
		
		InsertionSort is = new InsertionSort();
		is.sort(inputIS);
		printArray(inputIS);
		
		System.out.println();
		
		MergeSort ms = new MergeSort();
		ms.sort(inputMS, 0, inputMS.length-1);
		printArray(inputMS);

		System.out.println();
		
		QuickSort qs = new QuickSort();
		qs.sort(inputQS, 0, inputQS.length-1);
		printArray(inputQS);
	}

	private static void printArray(int[] input) {
		for( int i=0; i< input.length;i++) {
			System.out.print(input[i]);
			if( i < input.length-1 )
				System.out.print(",");
		}
	}
}
