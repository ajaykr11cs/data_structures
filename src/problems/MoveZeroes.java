/**
 * 
 */
package problems;

/**
 * @author ajkumar
 *
 */
public class MoveZeroes {
	
	public void moveZeroes(int[] nums) {
        //Brute force
        
        /*
        if( nums.length > 1)
        {
            int sum=0;
            for(int i=nums.length-1; i>=0; i--){
                if( nums[i] == 0 ){
                    for(int j=i; j<nums.length-1; j++){
                        nums[j] = nums[j+1];
                    }
                    nums[nums.length-1] = 0;
                }
            }    
        }
        */
        
        if( nums == null || nums.length < 2 )
            return;
        
        int numPos = 0;
        for(int i=0; i<nums.length; i++){
            if( nums[i] != 0 ){
                nums[numPos++] = nums[i];
            }
        }
        
        while(numPos < nums.length){
            nums[numPos++] = 0;
        }
    }

}
