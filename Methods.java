//עבודה באונ' פונקציות תרגיל 5ב

package A;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};

		for (int i = 0; i<arr.length; i++ ) {

		}
		System.out.println(arraySum(arr));	
		System.out.println(arrayMean(arr));
	//	System.out.println(rev);
	
	}

	
	
	public static double arraySum(int [] arr) {
		int sum = 0;

		for (int i = 0; i<arr.length; i++) {
			sum += arr[i];

		}
		return sum;	
	}

	public static double arrayMean(int [] num) {

		int sum = 0, avg = 0;
		for (int i = 0; i<num.length; i++) {

			sum = sum + num[i];
			avg = sum/num.length;	

		}
		return avg;
	}

	public static boolean palindrom(int [] arr){
		for (int i = 0; i<arr.length; i++) {
	//	if (arr[i] = arr [i-1])
			return true;}
	
		return false;
		
	}
	
	
}
