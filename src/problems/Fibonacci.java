/**
 * 
 */
package problems;

/**
 * @author ajkumar
 *
 */
public class Fibonacci {
	
	public long fibonacciRecursive(int index) {
		if( index < 2 ) {
			return index;
		}
		return fibonacciRecursive(index-1) + fibonacciRecursive(index-2);
	}
	
	public long fibonacciIterative(int index) {
		
		int[] fibSeries = new int[index+1];
		
		fibSeries[0] = 0;
		fibSeries[1] = 1;
		
		for(int i = 2; i <= index; i++) {
			fibSeries[i] = fibSeries[i-1] + fibSeries[i-2];
		}
		return fibSeries[index];
	}

}
