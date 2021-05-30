package A;
import java.util.Scanner;
public class Pyramid_nested_loop {
	// The idea to do Pyramid pattern in a loop came from "C++" course
	// https://courses.campus.gov.il/courses/course-v1:Basmach+PC264+1_2020/courseware/c583e5f424f14626a0e64a4cf7f23738/0f13851ea8394100ae63d5381c16f694/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variable definition
		int nHeight;
		int nIndex;
		int nBlanksCounter;
		int nAsterixCounter;

		Scanner input = new Scanner(System.in);
		// Code section

		// Get the wanted height
		System.out.println("Enter the wanted height: " );
		nHeight = input.nextInt();;

		// Check the height isn't negative
		if (nHeight < 0)
		{
			System.out.println( "The height can't be negative!" );
		}
		else
		{
			// If the height is even - make it odd
			// because we need odd level to built a perfect Pyramid
			if ((nHeight % 2 == 0) && (nHeight != 0))
			{
				nHeight++;
			}

			// Going over the levels of the pyramid, and printing them
			// we adding +2, and not +1, because in a Pyramid we need a difference of to blocks in each level
			/*
			 *      * 
			 *    * * *
			 *  * * * * *  
			 */
			for (nIndex = 1; nIndex <= nHeight; nIndex += 2)
			{
				// Printing blanks
				for (nBlanksCounter = 1;
						nBlanksCounter <= (nHeight - nIndex) / 2;
						nBlanksCounter++)
				{
					System.out.println(" ");
				}

				// Printing asterix
				for (nAsterixCounter = 1; nAsterixCounter <= nIndex; nAsterixCounter++)
				{
					System.out.println("*");
				}

				// End line on each level
				System.out.println();
			}
		}
		input.close();
	}

}
