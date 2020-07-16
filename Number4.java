// בגרות2010 שאלה 4

package A;

import java.util.Scanner;

public class Number4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);

System.out.println("Enter a nuber");

int k = input.nextInt();


int [] a = new int [821];

for(int i = 0; i<a.length; i++ ) {
	if(a[i] == k)
		System.out.println(i);
}
input.close();	
	
}
	
	
}