//בגרות 2010 שאלה 5

package A;

import java.util.Scanner;

public class Nuber5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input  = new Scanner(System.in);

System.out.println("Enter number a: ");
int a = input.nextInt();

System.out.println("Enter number b: ");
int b = input.nextInt();

int sum = 0;

while(a*b!=0) {
	sum+=a*b;

	System.out.println("Enter number a: ");
	  a = input.nextInt();

	System.out.println("Enter number b: ");
	  b = input.nextInt();

}
 System.out.println("sum = " + sum);
	}

}
