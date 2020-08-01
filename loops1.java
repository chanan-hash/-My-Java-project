package trainning;
import java.util.Scanner;
public class loops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
		
int grade, sum = 0;
double avg;

for(int i = 10; i<=1; i--){
	System.out.println("enter grade number" +" "+ i +":");
grade = in.nextInt();
System.out.println("grade entered successfully" + grade);
sum +=grade;

}
		
avg = (double)sum / 10;		
System.out.println("your final average is: " + avg);		
		
		


in.close();
	}

}
