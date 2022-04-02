package testing;

import java.util.HashMap;
import java.util.LinkedList;

import problems.MergeSortedArrays;
import problems.ReverseString;
import problems.TwoSum;

public class TestProblems {

	public static void main(String[] args) {
		
		//Reverse String
		ReverseString reverseString = new ReverseString();
		String inputString = "This is a new begining!!";
		System.out.println("Input String : "+ inputString);
		inputString = reverseString.reverseString(inputString);
		System.out.println("Input String : "+ inputString);
		inputString = reverseString.reverseString2(inputString);
		System.out.println("Input String : "+ inputString);
		System.out.println(reverseString.reverseString("h"));
		System.out.println("Reverse String recursively : "+ reverseString.reverseStringRecursively("Hi there"));
		
		
		//MergeSortedArrays
		
		MergeSortedArrays mergeArrays = new MergeSortedArrays();
		int[] array1 = {1, 5, 10, 18, 20};
		int[] array2 = {5, 9, 15, 19, 25, 50};
		int[] mergedArrays = mergeArrays.mergeSortedArrays( array1, array2);
		
		mergeArrays.printArrays(mergedArrays);
		
		//TwoSum
		TwoSum twoSumIndices = new TwoSum();
		int[] nums = {1,5,9,10,4,25};
		int target = 29;
		printArrays(nums);
		System.out.println("Indices for Two Sum :");
		printArrays(twoSumIndices.twoSum(nums, target));
		
		int arr[] = {2,5,5,2,3,1 };
		System.out.println("First Recurring Character: "+firstRecurringCharacter(arr));
		
		LinkedList list1 = new LinkedList();
		
	}
	
	public static void printArrays(int[] sampleArray) {
		StringBuffer tempArray = new StringBuffer();
		for(int index = 0; index < sampleArray.length; index++) {
			tempArray.append(sampleArray[index]).append(", ");
		}
		System.out.println(tempArray.toString());
	}
	
	public static int firstRecurringCharacter(int[] nums) {
		if(nums == null 
				|| nums.length < 2 )
			return -1;
		
		int elementDistance = 1;
		int index = 0;
		while( index + elementDistance < nums.length) {
			if(nums[index] == nums[index+elementDistance]) {
				return nums[index];
			}
			if( index + elementDistance == nums.length) {
				elementDistance++;
			}
			index++;
		}
		return -1;
	}	
	
}