package testing;
import storage.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestVectorStorage {

	@Test
	void testInteger() {
		VectorStorage<Integer> data = new VectorStorage<Integer>();
		data.add(4);
		assertEquals(4, data.remove(0), "Should be able to remove one item");
	}

}
