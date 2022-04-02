package problems;

public class MergeSortedArrays {
	
	public int[] mergeSortedArrays(int[] array1, int[] array2) {
		
		if( array1.length == 0 ) {
			return array2;
		}
		if( array2.length == 0 ) {
			return array1;
		}
		
		printArrays(array1);
		printArrays(array2);
		
		int mergedLength = array1.length + array2.length;
		int[] temp = new int[mergedLength];
		int index = 0;
		int array1Index = 0, array2Index=0;

		for( ; array1Index<array1.length && array2Index< array2.length; ) {
			if( array1[array1Index] < array2[array2Index]) {
				temp[index++] = array1[array1Index++];
			}else {
				temp[index++] = array2[array2Index++];
			}
		}
		
		while( array1Index < array1.length) {
			temp[index++] = array1[array1Index++];
		}
		
		while( array2Index < array2.length) {
			temp[index++] = array2[array2Index++];
		}
		
		return temp;
	}
	
	public void printArrays(int[] sampleArray) {
		StringBuffer tempArray = new StringBuffer();
		for(int index = 0; index < sampleArray.length; index++) {
			tempArray.append(sampleArray[index]).append(", ");
		}
		System.out.println(tempArray.toString());
	}
	
}
