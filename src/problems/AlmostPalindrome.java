package problems;

public class AlmostPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] samples = {
				"race a car",
				"abccdba",
				"abcdefdba",
				"",
				"a",
				"ab"
		};
		
		for(int i=0; i< samples.length; i++) {
			System.out.println(" Is Palindrome Method1: "+ isAlmostPalindrome(samples[i]));
		}
		
	}

	static boolean isAlmostPalindrome(String sample) {
		
		sample = sample.replaceAll("[^A-Za-z-0-9]", "").toLowerCase();
		int len = sample.length();
		//To account for removal of a character.  
		if( len < 3 )
			return true;
		
		char[] sChar = sample.toCharArray();
		for( int left=0, right=len-1; left <= right; left++, right--) {
			if( sChar[left] != sChar[right] ) {
				if( checkValidPalindrome(sample, left, right-1) 
						|| checkValidPalindrome(sample, left+1, right) ) {
					return true;
				}else {
					return false;
				}
			}
		}
		
		return true;
	}
	
	static boolean checkValidPalindrome(String sample, int left, int right) {
		
		char[] sChar = sample.toCharArray();
		while( left <= right ) {
			if( sChar[left] != sChar[right] ) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
}

