package shapes;

import java.awt.Color;
import java.awt.Point;

public class Square extends Shape implements Location {
	public final static double UNIT_LENGTH = 1.0;
	private double sideLength;
	private Point point;
	
	public Square() {
		this(Square.UNIT_LENGTH, Color.WHITE);
	}
	
	public Square(double sideLength, Color color) {
		this(sideLength, color, new Point(0,0));
	}
	
	public Square(double sideLength, Color color, Point point) {
		// calling superclass constructor
		super(color);
		this.point = point;
		this.sideLength = sideLength;
		this.calculateArea();
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + " sideLength = " + sideLength 
				+ "  area = " + area + super.toString()
				+ "  location = (" + point.x + ", " + point.y + ")";
	}
	
	@Override
	public Object clone() {
		return new Square(sideLength, this.getColor(), new Point(point));
	}
	
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
