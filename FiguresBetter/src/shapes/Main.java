package shapes;

public class Main {

	public static void main(String[] args) {
		
		Square square1 = new Square(10.0);
		square1.setSideLength(6.0);
		// changed in Square class so you CANNOT call setArea()!!!
//		square1.setArea(45.0);
		Square square2 = new Square(5.0);
		
		/*
		 *  "Override" the "toString()" method in the Square class to 
		 *  clean up the printing below
		 */
		
//		square2.calculateArea();
//		System.out.println("Square1 sidelength = " + square1.getSideLength() 
//						+ "  area = " + square1.getArea());
//		System.out.println("Square2 sidelength = " + square2.getSideLength()
//						+ "  area = " + square2.getArea());
		System.out.println(square1);
		System.out.println(square2);

	}

}
