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
		
//		for (int i=0; i < 33; i++) {
//			data.add(i);
//		}
		
		/* 
		 * autoboxing: when an simple integer type is passed in to data.add()
		 * it is automatically turned into an object of type Integer.
		 */
		data.add(4);
		data.add(Integer.valueOf(55));
		data.add(Double.valueOf(4.5));
		data.add("Hellooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
		
		for (Object o : data) {
			System.out.println(o);
		}
		
		System.out.println("Vector size: " + data.size());
		System.out.println("Vector capacity: " + data.capacity());

	}

}
