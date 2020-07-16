// בגרות 2016 שאלה 8

package A;
import java.util.Scanner;
public class number8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int count = 0, max = 0;

		System.out.println("num of patricipants: ");
		int num = input.nextInt();		

		while(num !=0 ) {
			System.out.println("family name: ");

			String name = input.next();

			Family family = new Family(num, name);
			int toPay = family.calePrice();

			System.out.println("name: " + family.getFamilyname()+ ", toPay: "+ toPay);

			count += family.getNum();
			if (toPay> max)
				max=toPay;

			System.out.println("num of participants: ");
			num = input.nextInt();



		}	
		System.out.println("num of participants is: " + count);
		System.out.println("max family price is: " + max);



	}

}
