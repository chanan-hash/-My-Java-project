// שאלות תרגול פונקציות אוניברסיטה

package A;

public class PracticeMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,3,4,5};
		System.out.println(arr);

		System.out.println("sum: " + arraySum(arr) );
		System.out.println("avg: " + arrayMean(arr));


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

		for(int i = 0; i<num.length; i++) {
			sum += num[i];
// קודם צריך שיהיה סכום על מנת לעשות ממוצע, ואז את הסכום אני מחלק באורךך המערך
			avg = sum/num.length;

		}
		return avg;

	}
}