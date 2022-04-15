package edu.npmg.list;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> list = new CycleLinkedList<>();
		System.out.println(list.isEmpty());
		list.add(7);
		list.add(8);
		list.add(1, 5);
		//get
		System.out.println(list.isEmpty());
		//System.out.println(list.size());
		System.out.println(list.get(6));
		System.out.println(list.get(-1));
		System.out.println(list.get(-5));
		//System.out.println(list.get(0));
		
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//list.clear();
		/*for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/

	}

}
