package arrays;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
		int[] intArray = new int[15];
		
		System.out.println(intArray[0]);
		
		intArray[0] = 215;
		intArray[1] = 213;
		intArray[2] = 569;
		intArray[3] = 123;
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		
		int[] intArray2 = { 215, 213, 569, 123 };
		System.out.println(intArray2[0]);
		System.out.println(intArray2[1]);
		
		System.out.println("Lenghth: " + intArray2.length);
		
		// ArrayList
		ArrayList arrayList = new ArrayList();
		arrayList.add(12341);
		arrayList.add(12342);
		arrayList.add(12343);
		arrayList.add(12344);
		arrayList.add(12345);
		arrayList.add(12346);
		arrayList.add(12347);
		System.out.println("Size: " + arrayList.size());
		System.out.println("Ge: " + arrayList.get(0));
		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("Loop ArrayList(Index: " + i + " , Value: " + arrayList.get(i) + ")");
		}
		
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("Loop Array(Index: " + i + " , Value: " + intArray[i] + ")");
	
		}
	

		
		

	}


	
}
