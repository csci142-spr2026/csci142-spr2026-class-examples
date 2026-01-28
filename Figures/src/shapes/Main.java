package shapes;

public class Main {

	/*
	 * NOTE: POORLY DESIGNED, PLEASE FIX!!!!!
	 * 
	 * 
	 * 
	 * 
	 * In this Main class, I will "instantiate" many "objects" from 
	 * each "class" that I have (e.g. Square or Rectangle)
	 */
	public static void main(String[] args) {
		
		/*
		 * The "Square" class is found without importing
		 * because it is in the same "package"
		 * 
		 * "Rectangle" isn't found because not in package,
		 * but even if it was in a different package, it 
		 * would not be found unless it was imported above
		 * 
		 * Below, "square1" and "square2" are each "instances" of 
		 * the Square class.
		 */
		//Rectangle rectangle = new Rectangle();
		
		Square square1 = new Square(10.0);
		square1.calculateArea();
		square1.setSideLength(6.0);
		Square square2 = new Square(5.0);
		square2.calculateArea();
		System.out.println("Square1 sidelength = " + square1.getSideLength() 
						+ "  area = " + square1.getArea());
		System.out.println("Square2 sidelength = " + square2.getSideLength()
						+ "  area = " + square2.getArea());


	}

}
