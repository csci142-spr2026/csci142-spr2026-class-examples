package shapes;

import java.awt.Color;
import java.awt.Point;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * In the line shapes[0] = new Square();
		 * this line uses the Square class constructor to create a new Square object,
		 * and then assigns it to the first element of the shapes array, 
		 * which is of type Shape.
		 * 
		 * Importantly, this line "instantiates" an "instance" of the Square class, 
		 * which is a concrete class that extends the abstract Shape class.
		 */
		Shape[] shapes = new Shape[6];
		shapes[0] = new Square();
		shapes[1] = new Rectangle();
		shapes[2] = new Rectangle();
		shapes[3] = new Square();
		shapes[4] = new Rectangle();
		shapes[5] = new Square();
		Random random = new Random();
		
		for (Shape shape : shapes) {
			shape.setColor(Color.BLUE);
			//shape.setSideLength(2.0); // compile-time error: Shape does not have setSideLength method
			
			if (shape instanceof Square) {
				Square square = (Square) shape;
				square.setSideLength(2.0);
			} else if (shape instanceof Rectangle) {
				Rectangle rectangle = (Rectangle) shape;
				rectangle.setHeight(3.0);
				rectangle.setPoint(new Point(1, random.nextInt(10)));
			}
			
			System.out.println(shape);
		}
		
		/*
		 * Polymorphism doesn't need to be for an array of shapes.  
		 * We can have a single shape variable that can refer to any shape object.
		 */
		Shape rect = new Rectangle(2.0, 3.0, Color.RED, new Point(5, 5));
		System.out.println(rect);
		//rect.setWidth(4.0); // compile-time error: Shape does not have setWidth method
		((Rectangle) rect).setWidth(4.0); // downcasting to Rectangle to call setWidth method
	}

}
