package shapes;

import java.awt.Color;

/*
 * "Square" is a "subclass" of the "superclass" Shape
 */
public class Square extends Shape {
	
	private double sideLength;
	
	public Square(double sideLength, Color color) {
		// calling superclass constructor
		super(color);
		this.sideLength = sideLength;
		this.calculateArea();
	}
	
	/*
	 * This "toString()" method "overrides" the Object class toString() method
	 */
	public String toString() {
		return this.getClass().getSimpleName() + " sideLength = " + sideLength 
				+ "  area = " + area + super.toString();
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

}
