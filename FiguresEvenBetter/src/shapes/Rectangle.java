package shapes;

import java.awt.Color;

/*
 * Must abide by the Square contract
 */
public class Rectangle extends Shape {
	
	private double length;
	private double width;

	public Rectangle(double length, double width, Color color) {
		super(color);
		this.length = length;
		this.width = width;
		
	}

	@Override
	public void calculateArea() {
		area = length * width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	

}
