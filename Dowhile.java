package trainning;
import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
		
int number, count = 0;		
	
do {	
System.out.println("enter a number between 1 - 5" + " time " + count);
number = in.nextInt();
count++;
}				
while(number<1 || number>5);{

System.out.println(number + " is good enough");
System.out.println("you tried " + count + " times");
}
	}	
	}