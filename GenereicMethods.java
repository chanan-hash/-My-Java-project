package A;

public class GenereicMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr1 = {1, 3, 5, 6};
		Double[] arr2 = {1.2, 4.56, 7.31, 10.01};		
		String [] arr3 = {"Hello", "My", "Name", "Is", "Chanan"};

		printArr(arr1);
		printArr(arr2);
		printArr(arr3); 

		System.out.println(getMax(arr1));
		System.out.println(getMax(arr2));	
		System.out.println(getMax(arr3));
	}

	public static <T> void printArr(T[] objects) {
		for (T obj : objects) {
			System.out.print(obj + " ");	
		}
		System.out.println();

	}

	public static <T extends Comparable<T>> T getMax(T[] objects) {
		T max = objects[0];
		for (T obj : objects) {
			if (obj.compareTo(max)>0) max = obj;
		}  	
		return max;
	}
} 