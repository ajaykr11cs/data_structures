package problems;

public class WaterContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {7,1, 3, 5, 9};
		//int[] input = {};
		System.out.println("MaxWaterArea :" + findMaxWater(input));
		System.out.println("Optimized MaxWaterArea :" + findMaxWaterOptimized(input));

	}

	static public int findMaxWater(int[] waterSlots) {
		
		int length = waterSlots.length;
		int maxArea = 0;
		for(int i=0; i<length; i++) {
			for(int j=i+1; j<length;j++) {
				int area = Math.min(waterSlots[i],  waterSlots[j]) * (j-i);
				maxArea = Math.max(maxArea, area);
			}
		}
		
		return maxArea;
	}
	
	static public int findMaxWaterOptimized(int[] waterSlots) {
		
		int length = waterSlots.length;
		int maxArea = 0, area = 0;
		int start = 0, end = length-1;
		while( start < end ) {
			area = Math.min(waterSlots[start], waterSlots[end]) * (end-start);
			maxArea = Math.max(area, maxArea);
			
			if(waterSlots[start] <= waterSlots[end]) {
				start++;
			}else {
				end++;
			}
		}
		
		return maxArea;
		
	}
}
