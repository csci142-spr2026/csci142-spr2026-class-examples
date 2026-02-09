package shapes;

import java.awt.Color;
import java.awt.Point;

public class Main {

	public static void main(String[] args) {
		/*
		 * BEGIN HERE IN MAIN WITH POLYMORPHISM!!!
		 */
		
		Square square1;
		
		square1 = new Square(Square.UNIT_LENGTH, Color.BLUE, new Point(4,5));
		square1.setSideLength(6.0);

		Point point = new Point(6, 7);
		Square square2 = new Square(5.0, Color.CYAN, new Point(point));
		
		Square square3 = (Square)square2.clone();
		square3.setSideLength(7.0);
		square3.setColor(Color.GREEN);
		square3.moveTo(111, 222);
		
		Square square4 = Square.copyOf(square3);
		square4.moveTo(33, 44);
		
		System.out.println(square1);
		System.out.println(square2);
		System.out.println(square3);
		System.out.println(square4);
		
	}

}
