package problems;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] samples = {
				"A man, a plan, a canal:Panama",
				"aabaa",
				"a",
				"",
				"abc"
		};
		
		for(int i=0; i< samples.length; i++) {
			System.out.println(" Is Palindrome Method1: "+ isValidPalindromeMethod1(samples[i]));
			System.out.println(" Is Palindrome Method2: "+ isValidPalindromeMethod2(samples[i]));
			System.out.println(" Is Palindrome Method3: "+ isValidPalindromeMethod3(samples[i]));
		}
	}
	
	//Two pointer inward method
	static boolean isValidPalindromeMethod1(String sample) {
		
		//System.out.println(" Sample String : "+ sample);
		sample = sample.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		//System.out.println(" Modified Sample String : "+ sample);
		
		int length = sample.length();
		if( length < 2 )
			return true;
		
		char[] sampleChars = sample.toCharArray();
		for(int left = 0, right = length-1; left<=right; left++, right--) {
			if( sampleChars[left] != sampleChars[right] ) {
				return false;
			}
		}
		
		return true;
	}

	//Two pointer outward
	static boolean isValidPalindromeMethod2(String sample) {
		
		//System.out.println(" Sample String : "+ sample);
		sample = sample.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		//System.out.println(" Modified Sample String : "+ sample);
		
		int length = sample.length();
		if( length < 2 )
			return true;
		
		int left = 0, right = 0;
		
		if( length%2 == 0 ) {
			left = length/2;
			right = left+1;
		}else {
			left = right = length/2;
		}
		
		char[] sampleChars = sample.toCharArray();
		while( left >= 0 && right < length )
		{
			if( sampleChars[left] != sampleChars[right] ) {
				return false;
			}
			left--;
			right++;
		}
		
		return true;
	}
	
	//Reverse String and check the validity
	static boolean isValidPalindromeMethod3(String sample) {
		
		sample = sample.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		//System.out.println(" Modified Sample String : "+ sample);
		
		int length = sample.length();
		if( length < 2 )
			return true;
		
		StringBuffer reverseSample = new StringBuffer(sample);
		reverseSample.reverse();
		//System.out.println(" Sample :"+ sampleBuf.toString()+", Reverse : "+ reverseSample.toString());
		
		return sample.toString().equals(reverseSample.toString());
	}
	
}
