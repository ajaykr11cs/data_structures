package problems;

public class Factorial {

	public long factorialRecursive(int number) {
		
		if( number <= 1 ) {
			return 1;
		}
		
		return number * factorialRecursive(number-1); 
	}
	
	public long factorialIterative(int number) {
		
		long fact = 1;
		for(int i=number; i>1; i--) {
			fact *= i;
		}
		return fact;
	}
}
