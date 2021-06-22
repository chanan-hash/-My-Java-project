package A;

import java.util.Scanner;

// This thing came from "C++" course and was translated to java language
// Enter numbers until there are three times negative numbers entered more than positive:in c++
// The idea how to do the answer was from here:
// https://stackoverflow.com/questions/39321325/write-a-program-that-keeps-taking-in-integers-until-a-negative-integer-is-given/39323818


public class Negattive_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int sum = 0;
		int counterP = 0;
		int counterN = 0;
		int avg;

		Scanner input = new Scanner (System.in);

		System.out.println("Enter a number: "); 
		n = input.nextInt();

		// while (counterN < counterP * 3){
		
		while (counterP != counterN * 3){
			if (n > 0){
				counterP ++;
			}
			else {
				counterN++;
			}
			sum += n;

			System.out.println("Enter a number: "); 
			n = input.nextInt();
		}

		avg = sum/(counterN+counterP);
		System.out.println("The avarage is: " + avg);

		input.close();
	}

}
