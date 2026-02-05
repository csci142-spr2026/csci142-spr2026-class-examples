package shapes;

import java.awt.Color;
import java.awt.Point;

/*
 * "Square" is a "subclass" of the "superclass" Shape
 */
public class Square extends Shape implements Location {
	
	private double sideLength;
	private Point point;
	
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
