package shapes;

/*
 * This "class" is a "blueprint" for creating many Square type
 * "objects", where each object created is an "instance" of this 
 * class.
 */

public class Square {
	
	/*
	 * A class defines its "attributes" (also can be called 
	 * "properties", "instance variables", or "fields"
	 */
	
	/* 
	 * "static" is not the same as "final"; "final" means 
	 * you cannot change the element (e.g. final double sideLength
	 * means once it is set, you cannot change it!)  "static" means
	 * it belongs to the class, not the object.
	 */
	
	/* 
	 * If you don't assign a value to sideLength, sideLength still 
	 * exists in memory with a location but no value. We are only
	 * "declaring" sideLength, not "initializing" sideLength.
	 */
	
	/*
	 * Almost always, attributes must be "private" or "protected" 
	 * (we'll mostly use private), NOT "public"
	 */
	private double sideLength;
	
	/*
	 * This is a Square "constructor".  The sideLength passed in
	 * is a "local variable" and it's "scope" is only the Square 
	 * constructor.  It disappears after the constructor is called. 
	 * However, the "scope" of the "this.sideLength" "property" 
	 * is the entire class, which is why it is defined above.
	 */
	public Square(double sideLength) {
		this.sideLength = sideLength;
	}

	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
	
	

}
