package problems;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWoRepeatChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sample = "abcbdac";
		System.out.println("Longest Substring length in String "+ sample+" is : "+ longestSubstringWithoutRepeatChars(sample));
		System.out.println("Longest Substring length in String "+ sample+" is : "+ longestSubstringWithoutRepeatCharsOptimized(sample));
		System.out.println("Longest Substring length in String "+ sample+" is : "+ longestSubstringWithoutRepeatCharsOptimized1(sample));
	}

	//Time Complexity : O(n^2)
	//Space Complexity : O(n)
	public static int longestSubstringWithoutRepeatChars(String sample) {
		
		int length = sample.length();
		if( length < 2 )
			return length;
		
		int maxLength = 0;
		char[] sampleChars = sample.toCharArray();
		
		for(int i=0; i<length; i++) {
			HashSet<Character> uniqueChars = new HashSet<Character>();
			int count = 0;
			for(int j=i; j<length; j++) {
				if( !uniqueChars.contains(sampleChars[j]) ) {
					count++;
					uniqueChars.add(sampleChars[j]);
					maxLength = Math.max(maxLength, count);
					
				}else {
					break;
					
				}	
			}
		}
		
		return maxLength;
	}
	
	public static int longestSubstringWithoutRepeatCharsOptimized(String sample) {
		
		int length = sample.length();
		if( length < 2 )
			return length;
		
		
		int maxLength = 0;
		int first = 0, last = 0;
		char[] sampleChars = sample.toCharArray();
		HashMap<Character, Integer> seenChars = new HashMap<Character, Integer>();  
		while( last < length ) {
			if( !seenChars.containsKey(sampleChars[last]) ) {
				//System.out.println("First Index, Last index -> ["+ first+", "+ last+"]");
				seenChars.put(sampleChars[last], last);
				maxLength = Math.max(maxLength, last-first+1);
				//System.out.println("MaxLength :"+maxLength);
				last++;
			}
			else {
				first++;
				last = first;
				seenChars.clear();
				//System.out.println("First Index, Last index -> ["+ first+", "+ last+"]");
			}
		}
		
		return maxLength;
	}
	
	
public static int longestSubstringWithoutRepeatCharsOptimized1(String sample) {
		
		int length = sample.length();
		if( length < 2 )
			return length;
		
		int maxLength = 0;
		int left = 0;
		char[] sampleChars = sample.toCharArray();
		HashMap<Character, Integer> seenChars = new HashMap<Character, Integer>();  
		for(int right = 0; right<length; right++)
		{
			char currentChar = sampleChars[right];
			if( seenChars.get(currentChar) != null
					&& seenChars.get(currentChar) >= left ) {				
				left = seenChars.get(currentChar)+1;
			}
			
			seenChars.put(currentChar, right);
			maxLength = Math.max(maxLength, right-left+1);
		}
		
		return maxLength;
	}
	
	
}
