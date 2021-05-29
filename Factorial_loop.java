package A;
import java.util.Scanner;
public class Factorial_loop {

	// The idea to do Factorial in a loop and not with recursion came from "C++" course
	// https://courses.campus.gov.il/courses/course-v1:Basmach+PC264+1_2020/courseware/c583e5f424f14626a0e64a4cf7f23738/0f13851ea8394100ae63d5381c16f694/
	// if we want we can put it in a Function that will get a value from the user and returns its Factorial	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using Factorial with loop instead with Recursion
		int nFactorial = 1;
		int nCounter;


		// Calculating the factorial
		for (nCounter = 1; nCounter <= 4; nCounter++)
		{
			nFactorial *= nCounter;
		}
		System.out.println("The factorial is: " + nFactorial);

		// Now with a number form the user

		// the factorial always start from 1 
		int numberF = 1;
		// it is like "i"
		int counterF;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		// A border/length to the factorial
		int	numberlength = input.nextInt();

		for (counterF = 1 ; counterF <= numberlength; counterF++) {
			numberF *= counterF;
		}
		System.out.println("The factorail is: " + numberF);
		input.close();	
	}

}
