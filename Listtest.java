package A;

import java.util.ArrayList;

public class Listtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> L1 = new ArrayList<Integer>();
		ArrayList<Integer> L2 = new ArrayList<Integer>(); 

		L2.add(3);
		L2.add(3);

		L1.add(4);	
		L1.add(1, 5);	
		L1.addAll(L2);

		L1.set(2, 25);

		for (Integer i : L1) 
			System.out.println(i);

		System.out.println(L1.contains(3));
		System.out.println(L1.contains(20));
		System.out.println(L1.containsAll(L2));

		System.out.println();

		System.out.println(L1.indexOf(3));
		System.out.println(L1.lastIndexOf(3));

		System.out.println();

		L1.remove(1);
		System.out.println(L1.get(1));

		L1.removeAll(L2);

		for (Integer i : L1) 
			System.out.println(i);

		System.out.println();

		Integer[]nums = (Integer[])L1.toArray();
		System.out.println();
		for (int i = 0; i<nums.length; i++) {
			System.out.println(i);
		}

		L1.trimToSize();
		
		L1.clear();
		System.out.println(L1.isEmpty());

	}

}	
