package storage;

public interface Storage<T> {
	boolean add(T o);
	T remove(int i);
	int count();

}
