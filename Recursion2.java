package A;

public class Recursion2 {

	public static boolean evenWith4(int i, int count, int[]nums) {
	if(i == nums.length) {
		if(count >= 4 || count == nums.length) return true ;
	}
	if(nums[i] % 2 !=0) return false;
	else count++;
	return evenWith4(i + 1, count, nums);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] nums = {2, 4, 6,8,4,7 }; 
	System.out.println(evenWith4(0, 0, nums));
	}

}

//0 1 1 2 3 5 8 13 21 34 55 89
//1 2 3 4 5 6 7  8  9 10 11 12
// a(n) = a(n - 1) + a(n - 2)
// n = fib(n - 1) + fib(n - 2)