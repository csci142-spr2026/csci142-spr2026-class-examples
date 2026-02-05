package shapes;

import java.awt.Color;

/*
 * Abstract classes (and interfaces) impose a "contract" that MUST
 * be adhered to.  
 * 
 * "design by contract"
 * 
 * Any class extending an "abstract" class MUST implement all 
 * the abstract methods inside.
 * 
 * Any class implementing an "interface" MUST implement all
 * the methods inside.
 */
public abstract class Shape {
	
	/*
	 * "protected" properties allow classes extending this class to see them,
	 * while "private" properties are not visible.
	 */
	private Color color;
	protected double area;
	
	public Shape(Color color) {
		if (color == null) {
			color = Color.BLACK;
		}
		this.color = color;
	}
	
	public abstract void calculateArea();
	
	public String toString() {
		return " color = " + color;
	}

	public Color getColor() {
		return color;
	}

	/*
	 * We have a choice NOT to have this setter if we don't want the
	 * shape to ever change color.
	 */
	public void setColor(Color color) {
		this.color = color;
	}

}
