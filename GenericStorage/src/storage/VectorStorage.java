package storage;

import java.util.Vector;

public class VectorStorage<T extends Number> implements Storage<T> {
	private Vector<T> data;
	
	public VectorStorage() {
		data = new Vector<T>();
	}

	@Override
	public boolean add(T o) {
		return data.add(o);
	}

	@Override
	public T remove(int i) {
		return data.remove(i);
	}

	@Override
	public int count() {
		return data.size();
	}

}
