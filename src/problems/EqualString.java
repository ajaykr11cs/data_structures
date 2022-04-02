package problems;

import java.util.Iterator;
import java.util.Stack;

public class EqualString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = "a####b";
		String second = "b";
		System.out.println("Strings Equal Check : "+ equalStrings(first, second));

	}
	
	
	//Brute Force Method
	//Assumption : Empty Strings are equal
	static boolean equalStrings(String first, String second) {
		boolean result = false;
		
		if( first.isEmpty() && second.isEmpty() )
			return true;
		
		if( first.isEmpty() 
				|| second.isEmpty() )
			return false;
		
		String firstSample = simplifyString(first.toCharArray());
		System.out.println("First Sample : "+ firstSample);
		String secondSample = simplifyString(second.toCharArray());
		System.out.println("Second Sample : "+ secondSample);
		if( firstSample.equals(secondSample) )
			return true;
		
		return result;
	}
	
	static String simplifyString( char[] sample){
		
		Stack<Character> simplified = new Stack<Character>();
		
		int length = sample.length;
		for( int i = 0; i < length; i++ ) {
			if( sample[i] == '#' ) {
				if( !simplified.isEmpty() )
					simplified.pop();
			}else {
				simplified.push(sample[i]);
			}
		}
		
		Character[] chr = simplified.toArray( new Character[simplified.size()]);
		
		return simplified.toString();
	}

}
