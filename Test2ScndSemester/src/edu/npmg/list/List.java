package edu.npmg.list;

public interface List<T> {
	
	void add(T element);
	void add(int index, T element);
	T get(int index);
	boolean isEmpty();
	void clear();
	int size();
	

}
