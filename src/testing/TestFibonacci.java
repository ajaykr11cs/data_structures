package testing;

import problems.Fibonacci;

public class TestFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fib = new Fibonacci();
		int noArray[] = {1, 3, 6, 8, 10};
		for(int i=0; i<noArray.length; i++) {
			System.out.println("Recursive Fibonacci no at "+ noArray[i]+" : "+ fib.fibonacciRecursive(noArray[i]));
			System.out.println("Iterative Fibonacci no at "+ noArray[i]+" : "+ fib.fibonacciIterative(noArray[i]));
		}
		

	}

}
