package shapes;

/*
 * "Design by contract" meaning the methods below form a contract
 * with a class that implements this interface.
 */
import java.awt.Point;

public interface Location {
	/*
	 * interfaces ONLY have abstract methods and cannot have
	 * private attributes because they are completely abstract;
	 * note below that you "can" put the word "abstract" for
	 * the method, it won't fail, but convention is you do not 
	 * use abstract keyword.
	 */
	public abstract Point locate();
	public void moveTo(int x, int y);
}
