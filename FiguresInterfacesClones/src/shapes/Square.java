package shapes;

import java.awt.Color;
import java.awt.Point;

/*
 * "Square" is a "subclass" of the "superclass" Shape
 */
public class Square extends Shape implements Location {
	
	private double sideLength;
	private Point point;
	
	/*
	 * "this" means call this class constructor with 3 arguments, which
	 * we have below
	 * 
	 * "super" means call the parent class constructor with its arguments
	 * (in this case 1, the color)
	 */
	public Square() {
		this(1.0, Color.WHITE, new Point(0,0));
	}
	
	public Square(double sideLength, Color color, Point point) {
		// calling superclass constructor
		super(color);
		this.point = point;
		this.sideLength = sideLength;
		this.calculateArea();
	}
	
	/*
	 * This "toString()" method "overrides" the Object class toString() method
	 */
	public String toString() {
		return this.getClass().getSimpleName() + " sideLength = " + sideLength 
				+ "  area = " + area + super.toString()
				+ "  location = (" + point.x + ", " + point.y + ")";
	}
	
	/*
	 * cloning is okay but copy constructor is better
	 */
	@Override
	public Object clone() {
		return new Square(sideLength, this.getColor(), new Point(point));
	}
	
	/*
	 * The preferred way to create a new object from this class is to use
	 * a "copy constructor"
	 * 
	 * "static" does not mean you cannot change it (that is what "final"
	 * means; it means it belongs to the class, not objects created from the
	 * class; therefore it cannot call properties (or attributes or fields)
	 * from within the static method.  We need to pass in a square.
	 */
	
	public static Square copyOf(Square square) {
		return new Square(square.sideLength, square.getColor(), new Point(square.locate()));
	}
	
	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
		this.calculateArea();
	}

	@Override 
	public void calculateArea() {
		area = sideLength * sideLength;
	}
	
	public double getArea() {
		return area;
	}

	@Override
	public Point locate() {
		
		return point;
	}

	@Override
	public void moveTo(int x, int y) {
		point.setLocation(x, y);
		
	}

}
