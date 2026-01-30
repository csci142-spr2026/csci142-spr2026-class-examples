package shapes;

import java.awt.Color;

public class Main {

	public static void main(String[] args) {
		
		Square square1 = new Square(10.0, Color.BLUE);
		square1.setSideLength(6.0);

		Square square2 = new Square(5.0, Color.CYAN);
		
		/*
		 *  "Override" the "toString()" method in the Square class to 
		 *  clean up the printing below
		 */
		
		System.out.println(square1);
		System.out.println(square2);

		
	}

}
