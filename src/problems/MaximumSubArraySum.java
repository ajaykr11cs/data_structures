/**
 * 
 */
package problems;

/**
 * @author ajkumar
 *
 */
public class MaximumSubArraySum {
	
	 public int maxSubArray(int[] nums) {
		 
        //Brute Force Solution: O(n^2)
        /*
        int largestSum = nums[0];
        for(int index=0; index<nums.length; index++)
        {
            int sum = 0;
            for(int j=index; j<nums.length; j++)
            {
                sum += nums[j];
                if( sum > largestSum ){
                    largestSum = sum;
                }
            }
        }
        */
		 //Kadane's Algorithm
		 // Considering the largest sum as min value helps in cases involving negative elements only in given Array. 
        int largestSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            largestSum = Math.max( sum, largestSum);
            
            if(sum < 0)
                sum = 0;
        }
        
        return largestSum;
    }
}
