package shapes;

public class Square {
	
	private double sideLength;
	private double area;
	
	public Square(double sideLength) {
		this.sideLength = sideLength;
		this.calculateArea();
	}
	
	private void calculateArea() {
		area = sideLength * sideLength;
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + " sideLength = " + sideLength + "  area = " + area;
	}
	
	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
		this.calculateArea();
	}

	public double getArea() {
		return area;
	}

	/*
	 * Dangerous! Delete the setter because it provides a way for the
	 * user to change the area without changing the sidelength.
	 */
//	public void setArea(double area) {
//		this.area = area;
//	}
//
}
