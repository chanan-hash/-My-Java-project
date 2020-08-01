package A;

import java.lang.reflect.Array;

public class Shiur29 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		int[] arr = new int[5];
		try {
			for (int i = 0; i<arr.length * 2; i++) arr[i] = i * 3;
		}catch(ArrayIndexOutOfBoundsException e)	{
			System.out.println("We have caught an exception!");
			e.printStackTrace();
		}finally {
			for (int i = 0; i<arr.length ; i++) arr[i] = i * 3;
		}

		System.out.println("This is the rest of the code!");
		for (int i = 0; i<arr.length ; i++)
			System.out.println(arr[i]);
	}
}