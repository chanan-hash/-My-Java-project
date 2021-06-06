package A;

import java.util.Scanner;

public class Printing_patterns {
	// https://courses.campus.gov.il/courses/course-v1:Basmach+PC264+1_2020/courseware/c583e5f424f14626a0e64a4cf7f23738/b7a5f9927c2f402e81e1dd24812aa422/?child=first
	// this is the place which the question came from - question number 31
	//The idea to do printing pattern of checkers board in a loop came from "C++" course
	// https://www.includehelp.com/cpp-programs/print-a-chessboard-pattern.aspx
	// the place I found answer and changed it a little bit

	// printing patterns checkers

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// your code goes here
		int n;

		Scanner in = new Scanner(System.in);

		System.out.println( "enter a number: ");
		n = in.nextInt();

		for (int i = 0; i<=n; i++){
			for (int j = 0 ; j< n; j++){
				if ((i+j)%2==0){
					System.out.print("*");
				}

				else{System.out.print(" ");
				}
			}
			System.out.println();
			in.close();
		}
	}
}


