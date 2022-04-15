package edu.npmg.list;

class Node<T> {
	private T data;
	private Node<T> next;
	
	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}
	
	public Node(T data) {
		this(data, null);
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public Node<T> getNext(){
		return next;
	}
}

public class CycleLinkedList<T> implements List<T>{
	
	private int size;
	private Node<T> first;
	private Node<T> last;

	@Override
	public void add(T element) {
		if(isEmpty()) {
			first = new Node(element);
			last = first;
			size++;
		}
		else {
			last.setNext(new Node(element));
			last = last.getNext();
			last.setNext(first);
			size++;
		}
		
	}

	@Override
	public void add(int index, T element) {
		if(index>-1 && index<=size()) {
			Node<T> current = first;
			Node<T> previous = null;
			int flag = 0;
			while(flag<index) {
				previous = current;
				current = current.getNext();
				flag++;
			}
			if(previous!=null) {
				previous.setNext(new Node(element, current));
			}
			else {
				first = new Node(element, first);
			}
			size++;
		}
		else {
			throw new IndexOutOfBoundsException();
		}
		
	}

	@Override
	public T get(int index) {
		
		if(index>-1) {
			
			while(index>size()-1) {
				index = index-size();
			}
			
		}
		else {
			
			while(index<0) {
				index = index+size();
			}
		}
		Node<T> find = first;

		while(index>0) {
			find = find.getNext();
			index--;
		}
		
		return find.getData();
	}

	@Override
	public boolean isEmpty() {
		if(first == null) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public void clear() {
		size = 0;
		first = null;
		last = null;
		
		
	}

	@Override
	public int size() {
		return size;
	}
	
	public CycleLinkedList(){
		clear();
	}

}
