package shapes;

import java.awt.Color;
import java.awt.Point;

public class Main {

	public static void main(String[] args) {
		/*
		 * square1 is ONLY "declared" in the next line.
		 * The following line "instantiates" it.
		 */
		Square square1;
		square1 = new Square(10.0, Color.BLUE, new Point(4,5));
		square1.setSideLength(6.0);

		Point point = new Point(6, 7);
		Square square2 = new Square(5.0, Color.CYAN, new Point(point));
		
		/*
		 * setting "square3 = square2" ONLY sets the memory location
		 * of square3 to that of square2; this is called an
		 * "aliasing" problem.
		 * 
		 * Because the "clone()" method returns an Object (not a Square)
		 * we must "cast" the returned object to its proper type, 
		 * namely a Square here.
		 */
		Square square3 = (Square)square2.clone();
		square3.setSideLength(7.0);
		square3.setColor(Color.GREEN);
		square3.moveTo(111, 222);
		
		/*
		 * Use the "copy constructor" to create a new object
		 */
		Square square4 = Square.copyOf(square3);
		square4.moveTo(33, 44);
		/*
		 *  "Override" the "toString()" method in the Square class to 
		 *  clean up the printing below
		 */
		
		System.out.println(square1);
		System.out.println(square2);
		System.out.println(square3);
		System.out.println(square4);
		
	}

}
