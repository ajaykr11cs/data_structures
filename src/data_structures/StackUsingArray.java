/**
 * 
 */
package data_structures;

/**
 * @author ajkumar
 *
 */
public class StackUsingArray<X> {

	X[] elements;
	int length;
	final int DEFAULT_STACK_SIZE = 10;
	
	public StackUsingArray() {
		this.elements = (X[]) new Object[DEFAULT_STACK_SIZE];
		this.length = 0;
	}
	
	public void push(X item) {
		if( item == null)
			return;
		
		if( this.length < DEFAULT_STACK_SIZE ) {
			this.elements[this.length] = item;
			this.length++;
		}
		else {
			System.out.println("Stack Overflow!!");
		}
		printArray();
	}
	
	public X pop() {
		if( this.length == 0 ) {
			System.out.println("Empty Stack!");
			return null;
		}
		X tempElement = this.elements[length-1];
		this.elements[length-1] = null;
		this.length--;		
		
		return tempElement;
	}
	
	public X peek() {
		if( this.length == 0 ) {
			System.out.println("Empty Stack!");
			return null;
		}
		
		return this.elements[this.length-1];
	}
	
	public boolean isEmpty() {
		return this.length == 0 ? true : false; 
	}
	
	public int size() {
		return this.length;
	}
	
	public String toString() {
		StringBuffer tempStack = new StringBuffer();
		for(int i=this.length-1; i>=0; i--) {
			tempStack.append(this.elements[i]);
			if( i > 0) {
				tempStack.append("-->");
			}
		}
		
		return tempStack.toString();
	}
	
	public void printArray() {
		for(int i=this.length-1; i>=0; i--) {
			System.out.println(this.elements[i]);
			if( i > 0 ) {
				System.out.println("-->");
			}
		}
	}
	
}
