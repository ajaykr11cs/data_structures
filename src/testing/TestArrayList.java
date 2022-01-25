package testing;

import data_structures.MyCustomArrayListForIntegers;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCustomArrayListForIntegers arrayList = new MyCustomArrayListForIntegers();
		arrayList.add(5);
		arrayList.add(10);
		arrayList.add(19);
		
		System.out.println("ArrayList: "+ arrayList);
		System.out.println(arrayList.getData(1));
		
		arrayList.add(21);
		arrayList.add(25);
		
		System.out.println("ArrayList: "+ arrayList);
		System.out.println(arrayList.getData(4));
		
		arrayList.remove(1);
		
		System.out.println("ArrayList: "+ arrayList);
		System.out.println(arrayList.getData(5));
		
	}

}
