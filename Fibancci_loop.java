package A;

public class Fibancci_loop {

	// The idea to do Pyramid pattern in a loop came from "C++" course
	// https://courses.campus.gov.il/courses/course-v1:Basmach+PC264+1_2020/courseware/c583e5f424f14626a0e64a4cf7f23738/0f13851ea8394100ae63d5381c16f694/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NUM_OF_ITEMS = 10;

		// Variable definition
		int nFirstNum = 0;
		int nSecondNum = 1;
		int nHelpNum;
		int nNumIndex;

		// Code section

		System.out.println("The Fibonacci series: ");

		// Printing items of the Fibonacci series
		for (nNumIndex = 1; nNumIndex <= NUM_OF_ITEMS; ++nNumIndex)
		{
			System.out.println( nFirstNum + ", " );
			nHelpNum = nSecondNum;
			nSecondNum += nFirstNum;
			nFirstNum = nHelpNum;
		}

		System.out.println( "That's all...");

	}

}
