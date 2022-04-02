/**
 * 
 */
package problems;

import java.util.HashMap;

/**
 * @author ajkumar
 *
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        
        
        int[] tempIndices = new int[2];
        if( nums.length < 2)
            return tempIndices;
        
        //Brute force method. T.C : O(n^2)
        /*
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if( nums[i]+nums[j] == target){
                    tempIndices[0] = i;
                    tempIndices[1] = j;
                    return tempIndices;
                }
            }
        }
        */
        
        //Solution with TC: O(n)
        HashMap<Integer, Integer> tempMap = new HashMap<Integer, Integer>();
        for(int index=0; index<nums.length; index++){
            if( tempMap.containsKey( target - nums[index])){
                tempIndices[0] = index;
                tempIndices[1] = tempMap.get( target - nums[index]);
                return tempIndices;
            }else{
                tempMap.put(nums[index], index);
            }
        }
        
        //Returning empty temp as no solution found.
        return tempIndices;
    }
    
    
}
