/**
 * 
 */
package data_structures;

/**
 * @author ajkumar {@summary : This class is developed to create custom
 *         ArrayList and replicate the behaviour of the default implementation
 *         in Java.}
 * 
 *         Methods Implemented : 1) add( element ) 2) clear() 3) contains(
 *         Object o) 4) get( index ) 5) remove( index ) 6) size()
 */
public class MyCustomArrayListForIntegers {

	private int length;
	private int[] data;
	private final int DEFAULT_SIZE = 4;

	public MyCustomArrayListForIntegers() {
		// TODO Auto-generated constructor stub
		this.length = 0;
		this.data = new int[DEFAULT_SIZE];
	}

	public int add(int element) {
		// Check for overflow of Array, if yes need to double the capacity and then copy
		// all the elements in the new array and then add the newest element.
		if (this.data.length <= this.length) {
			int[] tempData = new int[ this.data.length * 2 ];
			tempData = copyArrayElements( this.data, tempData );
			this.data = tempData;
		}

		this.data[this.length] = element;
		this.length++;
		return this.length;
		
	}

	public int getData(int index) throws IllegalArgumentException {
		if (index < 0 || index >= this.length) {
			throw new IllegalArgumentException("Specified index out of array bounds");
		}
		return data[index];
	}
	
	public int remove(int index) {
		if (index < 0 || index > this.length) {
			throw new IllegalArgumentException("Specified index out of array bounds");
		}
		int tempData = this.data[index];
		for(int i = index; i < this.length; i++ ) {
			this.data[i] = this.data[i+1];
		}
		this.length--;
		return tempData;
	}
	

	private int[] copyArrayElements( int[] sourceData, int[] destinationData) {
		for( int index = 0; index < sourceData.length; index++ )
		{
			destinationData[index] = sourceData[index];
		}
		return destinationData;
	}
	
	public String toString() {
		StringBuffer arrayString = new StringBuffer();
		for(int index = 0; index < this.length; index++) {
			arrayString.append(this.data[index]).append(", ");
		}
		arrayString.deleteCharAt(arrayString.length()-2);
		return arrayString.toString();
	}
	
}
