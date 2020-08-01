package trainning;
import java.util.Scanner;
public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
			
int number;

System.out.println("Please enter a number");
number = in.nextInt();

switch (number) {
case 1:
case 2:
case 3:
p("this number is small");
break;
case 4:
case 5:
case 6:
	p("this number is medium");
	break;
case 7:
case 8:
case 9:
case 10:
	p("this number is Great");
	break;

	default: p("try another number");	
}
		in.close(); 
	}

	public static void p (String s) {
		System.out.println(s);
	}

}
