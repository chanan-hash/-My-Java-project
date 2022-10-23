package A;

import java.util.Scanner;

// Finding Fibonacci number by giving the index number
//The idea to do Fibonacci number in a loop came from "C++" course
// https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
// the third option there

public class Fibonacci_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// your code goes here
		int n; 
		int a = 0, b = 1, c, i;

		Scanner input = new Scanner(System.in);

		System.out.println( "Enter a number:" );
		n = input.nextInt(); 
		// Fibonacci Series using Space Optimized Method
		if( n < 0)
			System.out.println("Enter another number ");

		else{
			for(i = 2; i <= n; i++)
			{
				// we want to see b, because he is the next value
				// c, is making the next value, and b is giving us it. and for the next iteration it will be prepared
				c = a + b;
				a = b;
				b = c;
			}
			System.out.println("The number in Index " + n + " is: " + b );
		}
		// Driver code
		input.close();

	}
}
// there are also code for the opposite situation, we giving a number in the Fibonacci series and it is giving us the Index number
// the amazing thing that we doing it pretty much in a simple code, that means we don't using method or list/arrays, only condition and a loop
