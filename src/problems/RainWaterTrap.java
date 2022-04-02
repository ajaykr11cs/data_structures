package problems;

public class RainWaterTrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {0,1,0,2,1,0,3,1,0,1,2};
		System.out.println("Maximum RainWater trapped : "+ findMaxRainWaterTrapped(input));
		System.out.println("Maximum RainWater trapped : "+ findMaxRainWaterTrappedOptimized(input));

	}
	
	//Time Complexity : O(n^2)
	public static int findMaxRainWaterTrapped(int bars[]) {
		
		int length = bars.length;
		int totalArea = 0;
		int maxLeft = 0, maxRight = 0;
		for(int i=0; i<length; i++) {
			
			maxLeft = findMaxElement(bars, 0, i-1);
			maxRight = findMaxElement(bars, i+1, length-1);
			
			//System.out.println(" Element at "+i+" is : "+ bars[i]);
			//System.out.println("MaxLeft Element: "+ maxLeft+", MaxRight Element : "+ maxRight );
			
			int area = Math.min(maxRight, maxLeft) - bars[i];
			if( area > 0)
				totalArea += area;
			
			//System.out.println(" Area at "+i+" is : "+ area);
		}
		
		return totalArea;
	}
	
	static int findMaxElement(int[] bars, int start, int end) {
		
		int maxElement = 0;
		for(int i= start; i<= end; i++) {
			//System.out.println(" start: "+ bars[start]+", MaxElement : "+maxElement);
			if(bars[start] > maxElement)
				maxElement = bars[start];
			
			start++;
		}
		//System.out.println("MaxElement: "+ maxElement);
		return maxElement;
	}
	
	//Time Complexity : O(n)
	static int findMaxRainWaterTrappedOptimized(int heights[]) {
		
		int total = 0;
		int length = heights.length;
		int maxLeft = 0, maxRight = 0;
		for(int left = 0, right = length-1; left < right;) {
			if( heights[left] <= heights[right]) {
				if( heights[left] < maxLeft ) {
					total += maxLeft - heights[left];
				}
				else {
					maxLeft = heights[left];
				}
				left++;
			}else {
				if( heights[right] < maxRight ) {
					total += maxRight - heights[right];
				}else {
					maxRight = heights[right];
				}
				right--;
			}
		}

		return total;
	}

}
