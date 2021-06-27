package A;

import java.util.Scanner;
//import java.math.*;

//This thing came from "C++" course and was translated to java language
// the question and the answer they gave is in the link below
// https://courses.campus.gov.il/courses/course-v1:Basmach+PC264+1_2020/courseware/c583e5f424f14626a0e64a4cf7f23738/0a2d0948f5874da0acec4cd679e9cd36/

public class Bank_Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//	int NUM_OF_DIGITS = 2;

		int CodeKey;
		int CurrFactor;
		int CurrKey;
		int TempKey;

		// Asking for user's input
		System.out.println("Please enter a number: ");
		CodeKey = input.nextInt();

		// Saving the user's code 
		TempKey = CodeKey;

		// Getting the 2 right digits - if we'll do modulu with 10, we'll get the rightest digit, 100 - 2 right digits, 1000 - 3 right digits, etc'
		// why does it work like that? for example lets take the number 123. if we will divide it by 100 we'll get rest of 23, because 123 can get in 100 only One time and than we'll have left 23.
		// by modulu (%) we're looking for the rest with a given number, so here with 100, it will be 23, and them is actually the right digits (but, we're getting the number that it is equal to the right digits, we aren't getting 2 & 3, we getting 23)

		CurrKey = TempKey % 100;

		// Continuing while there are more digits
		while (TempKey > 0) {

			// Removing the 2 tight digits
			TempKey /= 100;

			// Initializing the division factor
			CurrFactor = 2;

			// Continuing while we didn't find all the factors
			while (CurrFactor <= Math.sqrt(CurrKey)) {

				// If the current number is a factor of the current key
				if ((CurrKey % CurrFactor) == 0)
				{
					System.out.println(CurrFactor);
					// to get the next numbers
					CurrKey /= CurrFactor;
				}
				// If the number is not a factor
				else
				{
					CurrFactor++;
				}
			}
		}
		// Print the current key
		System.out.println("Your code for the bank is: " + CurrKey);

		// Calculating the next key
		CurrKey = TempKey % 100;

		input.close();
	}
}


