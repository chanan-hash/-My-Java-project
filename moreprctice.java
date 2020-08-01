package trainning;
import java.util.Scanner;
public class moreprctice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
	
int n1;
	
		
System.out.println("enter your numebr");
		
n1 = in.nextInt();
		
//g1 = (n1 % 2 == 0);		
		
if (n1 < 8) {System.out.println( n1 + " the number is correct");}
else {System.out.println(n1 + " is not correct");	
if (n1 == 8) {System.out.println("it is also correct");}		
else {System.out.println("it's still incorecct");}		
		
}
in.close();		
	}

}
