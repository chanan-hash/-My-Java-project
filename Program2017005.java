// בגרות 2017 שאלה 5
package A;

public class Program2017005 {

	public static int[] what(int[] arr, int k) {
		int n = arr.length;
		int[] b = new int [n];
		// ככה אנחנו עושים עד קיי עצמו כולל
		int [] c = new int[k+1];

		// בשאלה בכל פעם היה צריך להתחייס ללולאה אחרת בנפרד
		// כאילו כל פעם עובדים עם לולאה אחרת
		for (int i = 0; i<k+1; i++) c[i] = 0; 
		for (int j = 0; j<n; j++) c[arr[j]] = c[arr[j]] +1; //*

		for (int i = 1; i<k+1; i++) c[i] = c[i] - c[i-1]; //**

		for (int j = n-1; j>=0; j--) //***
		{
			b[c[arr[j]] - 1] = arr[j];
			c[arr[j]] = c[arr[j] - 1];
		}

		return b;

	}

	public static void main (String [] args) {
		int[] arr = new int [] {5,0,2,1,3,0,5};
		arr = what(arr,5);
		for (int i = 0; i<arr.length; i++) System.out.println(arr[i]);  


	}	


}
