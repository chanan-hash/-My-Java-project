// 2017 Bagrut (final exam) question 1 

package A;

import java.util.Scanner;

import javax.swing.plaf.metal.MetalBorders.PaletteBorder;
public class Nuber2017001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int[] array = {5,6,7,8,9};

		System.out.println(BigA(array));
		System.out.println(BigB(array));		
		input.close();

	}


	public static int BigA(int [] arr){

		int max = 0;

		for (int i = 0; i<arr.length; i++) {
			if (arr[i] > arr[max]) {
				max = i;
			}
		}
		return max;

	}	

	public static int BigB (int[] arr) {

		int max = arr[0];

		int place = 0;

		for (int i = 1; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				place = i;
			}
		}
		return place;
	}
}
