package testing;

import problems.Factorial;

public class TestFactorial {

	public static void main(String[] args) {
		Factorial fact = new Factorial();
		int numArray[] = {0, 1, 2, 3, 5, 8, 10};
		for(int i=0; i< numArray.length; i++) {
			System.out.println("Recursive Factorial of "+numArray[i]+" : "+fact.factorialRecursive(numArray[i]));
			System.out.println("Iterative Factorial of "+numArray[i]+" : "+fact.factorialIterative(numArray[i]));
		}
	}
}
