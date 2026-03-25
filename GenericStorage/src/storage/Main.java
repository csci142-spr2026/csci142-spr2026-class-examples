package storage;

public class Main {

	public static void main(String[] args) {
		/*
		 * Note that if VectorStorage uses <T extends Number>, String
		 * will not work because String does not extend Number, but Integer,
		 * Double, Float, etc. do and can be used
		 */
		//VectorStorage<String> data = new VectorStorage<String>();
		VectorStorage<Float> data = new VectorStorage<Float>();
		
		data.add(55.0f);
		data.add(44.3f);
		System.out.println("Count = " + data.count());
		System.out.println("Remove last element:" + data.remove(1));

	}

}
