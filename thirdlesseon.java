package trainning;
import java.util.Scanner;
public class thirdlesseon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner (System.in);
		

int number;

System.out.println("enter a number");

number = in.nextInt(); 
 
if(number>6){
System.out.println(number + "המספר גדול מ");
}else if(number==6){
	System.out.println(number + "המספר קטן מ");
}else {
	System.out.println(number + " equal nothing");
}
in.close();



 
	}

}
