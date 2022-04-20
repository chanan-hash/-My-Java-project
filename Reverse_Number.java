package A;

import java.util.Scanner;

public class Reverse_Number {
	// https://techstudy.org/CplusplusLanguage/Write-Cplusplus-program-to-reverse-a-number-using-while-and-for-loop
	// Although the answer came form c++, the algorithm is the same for every language - java, python, etc	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int num, rev = 0;

		//Reading a number from user
		System.out.println("Enter any number:");
		num = in.nextInt();

		//finding reverse number using for loop

		/*
		 * if we want to do it in while loop -  
		 * while (num != 0 ){
			rev = rev * 10;
			rev = rev + num % 10;
			num = num/10;
		 */

		// in each iteration we want to divide num at 10, and because it is an 'int' and not double we'll get a integer number - 123/10 = 12, and not 12.3   
		for (rev = 0; num > 0; num = num / 10) {
			rev = rev * 10; // giving us the left number form the big number, if the number is 456 so - 456 modulu 10 is 6. because 450 can be divided perfectly in 10, and then we'll have left 6.
			//this is important to remember when we want to get the ones digit from a number. and if we want the 10th number we will do modulu with 100, and goes on and on.
			rev = rev + num % 10; // we adding the numbers
		}

		System.out.println("Reversed number is: " + rev);
		in.close();	 		
	}

}
/*
 *  let me show how the number is being reversed  - lets debug it by "hand"
 *  for example lets take the number 782
 *  
 *  first iteration:
 *  			rev - 0
 *  			num - 782
 * 	
 *  			rev = 0 *10 --> 0
 * 				rev = 0 + num % 10 -- > 0 + 782 % 10 --> 0 + 2 = 2
 * 	
 *  			num = num/10 --> 782/10 = 78 (becuase we dividing int, and not a double or float)
 *
 *  			num - 78
 *  			rev - 2
 *
 *
 *	second iteration:
 *			rev - 2
 *			num - 78
 *
 *			rev = 2 * 10 --> 20
 *			rev = 20 + num % 10 --> 20 + 8 = 28
 *
 *			num = num/10 --> 78/10 = 7
 *			
 *			rev - 28
 *			num = 7
 *
 *
 *	third iteration:
 *			rev - 28
 *			num - 7
 *
 *			rev = 28 * 10 --> 280
 *			rev = 280 + num % 10 --> 280 + 7 = 287
 *
 *			num = num/10 --> 8/10 --> because it is 'int' it becoming less than Zero, and the loop is finished
 *
 *			
 *	now we're printing 'rev' and its equal to 287, the reversed number from 782
 *
 *	actually we didn't really reversed the number, we didn't change the places of the digits
 *	for doing that there are all kind of ways such as:
 *				turning the number to a 'String', and than to go over it by loop from end to beginning - descending loop (for (int i = n; i>=0; i--))
 *				then to add the 'String' number every iteration, to a new String that will be reversed
 *				and then to turn/convert back the 'String' to a 'int' and print it 
 *
 * here we've created a new number by an algorithm so it will look reversed, but actually we added numbers so it will be the number that reversed to the first number
 * watch again the debug
 */			



