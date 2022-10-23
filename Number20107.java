// 2010 Bagrut (final exam) question 7 

package A;

import java.util.Scanner;

public class Number20107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int countBoys = 0, countGirls = 0;
		
		for (int i =0 ; i<1000 ; i++) {

			System.out.println("month: ");
		int month = in.nextInt();
		
		System.out.println("year: ");
		int year = in.nextInt();
		
		System.out.println("gender B - boy, G - girl");
		
		char gender = (char)in.next().charAt(0);
		
		if(inDate(month, year))
			if(gender == 'b' || gender == 'B')
				countBoys++;
			
			else countGirls++;
		
		System.out.println("Boys = " + countBoys);
		System.out.println("Girls = " + countGirls);
		
		
		}
		
		/*
		 * אפשר לעשות שהקלט של הבן והבת יהיה במספר ולא בתו
		 * 
		 * syso("Boy - 0, Girls - 1)
		 * 
		 * int gender = in.nextInt();
		 * 
		 *if(inDate(month, year))
     	 *	if(gender == 0)
     	 *		countBoys++;
     	 *	else
     	 *		countGirls++;
		 *
		 */
	
		in.close();
		
	}

	public static boolean inDate(int month, int year) {
	if(month >=1 && month<=6 && year ==2009)
		return true;
	return false;
		
	/*אפשרות נוספת
	 * 
	 *  
	 * boolean correctMonth = 1<=month<=6;   month>=1 && month<=6;
	 * 
	 * boolean correctYear = year == 2009;
	 *  
	 * return  correctMonth && correctYear 
	 */
	
	
	}
	
}
