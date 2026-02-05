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

		Square square2 = new Square(5.0, Color.CYAN, new Point(6, 7));
		
		/*
		 * setting "square3 = square2" ONLY sets the memory location
		 * of square3 to that of square2; this is called an
		 * "aliasing" problem.
		 */
		Square square3 = square2;
		/* XXXXXXXXXXXXXXX I Stopped here!!!! */
		square3.setSideLength(7.0);
		square3.setColor(Color.GREEN);
		/*
		 *  "Override" the "toString()" method in the Square class to 
		 *  clean up the printing below
		 */
		
		System.out.println(square1);
		System.out.println(square2);
		System.out.println(square3);

		
	}

}
