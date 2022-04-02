package problems;

public class ReverseString {
	
	public String reverseString( String sample ) {
		if( sample == null 
				|| sample.isBlank()
				|| sample.isEmpty() 
				|| sample.length() < 2) {
			//throw new IllegalArgumentException("Invalid String input provided.");
			return sample;
		}
		
		char[] sampleChars = sample.toCharArray();
		for(int first=0, last=sampleChars.length-1; first<last; first++, last-- ) {
			char tempLast = sampleChars[last];
			sampleChars[last] = sampleChars[first];
			sampleChars[first] = tempLast;
		}

		return createString(sampleChars); 
	}
	
	public String createString( char[] sampleString) {
		StringBuffer tempString = new StringBuffer();
		for(int index=0; index<sampleString.length; index++) {
			tempString.append(sampleString[index]);
		}
		return tempString.toString();
	}
	
	public String reverseString2( String sample ) {
		if( sample == null 
				|| sample.isBlank()
				|| sample.isEmpty() 
				|| sample.length() < 2) {
			//throw new IllegalArgumentException("Invalid String input provided.");
			return sample;
		}
		
		StringBuffer temp = new StringBuffer(sample);
		return temp.reverse().toString(); 
	}
	
	public String reverseStringRecursively(String sample) {
		if(sample.length() < 2 ) {
			return sample;
		}
		
		return reverseStringRecursively(sample.substring(1)) + sample.charAt(0) ;
	}
	
	public void printCharArray(char[] sample) {
		for(int i=0; i < sample.length; i++) {
			System.out.print(sample[i]);
		}
		System.out.println();
	}
}
