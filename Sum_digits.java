package A;

import java.util.Scanner;

public class Sum_digits {
	/* https://courses.campus.gov.il/courses/course-v1:Basmach+PC264+1_2020/courseware/c583e5f424f14626a0e64a4cf7f23738/b7a5f9927c2f402e81e1dd24812aa422/?child=first
	 * this is the place which the question came from - question number 33
	 * the place I found answer and changed it a little bit
	 * https://www.javatpoint.com/sum-of-digits-program-in-cpp
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// your code goes here
		int n, m , sum = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a nubmer: "); 
		n = input.nextInt();			
		if (n < 100){
			System.out.println( "Enter another number, geater than 100 : ");
		}

		else{
			while(n > 0){    
				// thats how we getting the number separated
				m=n%10;    
				// adding the it to  the sum
				sum=sum+m;    

				n=n/10;    
			}    
			System.out.println("Sum is= " + sum);   
		}
		input.close();
	}
}

