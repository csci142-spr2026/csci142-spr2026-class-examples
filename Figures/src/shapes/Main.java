package shapes;

public class Main {

	/*
	 * In this Main class, I will "instantiate" many "objects" from 
	 * each "class" that I have (e.g. Square or Rectangle)
	 */
	public static void main(String[] args) {
		
		/*
		 * The "Square" class is found without importing
		 * because it is in the same "package"
		 * 
		 * "Rectangle" isn't found because not in package,
		 * but even if it was in a different package, it 
		 * would not be found unless it was imported above
		 */
		Square square = new Square(10.0);
		//Rectangle rectangle = new Rectangle();

	}

}
