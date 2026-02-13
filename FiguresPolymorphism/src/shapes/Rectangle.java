package shapes;

import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Shape implements Location {
	private double height, width;
	private Point point;
	
	public Rectangle() {
		this(1.0, 1.0, Color.WHITE, new Point(0, 0));
	}

	public Rectangle(double height, double width, Color color, Point point) {
		super(color);
		this.height = height;
		this.width = width;
		this.point = new Point(point);
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + ": width = " + width
				+ "  height = " + height + "  area = " + area + super.toString()
				+ "  location = (" + point.x + ", " + point.y + ")";
	}

	@Override
	public Point locate() {
		return point;
	}

	@Override
	public void moveTo(int x, int y) {
		point.setLocation(x, y);
		
	}

	@Override
	public void calculateArea() {
		area = height * width;
		
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width <= 0) {
			throw new IllegalArgumentException("Width must be positive");
		}
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

}
