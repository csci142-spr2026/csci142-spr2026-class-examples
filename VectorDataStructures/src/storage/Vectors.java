package storage;

import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
//		 Arrays
//		int[] data = {1,2,3,4,5};
//		data[2] = 11;
//		data[5] = 12; // cannot do because array is fixed size of 5
//		
//		System.out.println(data[2]);
		
		Vector data = new Vector(33, 20);
		
		System.out.println("Vector size: " + data.size());
		System.out.println("Vector capacity: " + data.capacity());
		
		for (int i=0; i < 34; i++) {
			data.add(i);
		}
		
		System.out.println("Vector size: " + data.size());
		System.out.println("Vector capacity: " + data.capacity());

	}

}
