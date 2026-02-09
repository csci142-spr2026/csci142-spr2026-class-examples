package shapes;

/*
 * "Design by contract" meaning the methods below form a contract
 * with a class that implements this interface.
 */
import java.awt.Point;

public interface Location {
	public Point locate();
	public void moveTo(int x, int y);
}
