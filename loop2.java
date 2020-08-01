package trainning;
import java.util.Scanner;
public class loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);

int grade, count = 0, sum = 0;
double avg;

System.out.println("enter your 1st number");

grade = in.nextInt();

while (grade != 0) {
	count++;
	sum += grade;
	System.out.println("enter graade number" + (count + 1));
grade = in.nextInt();

}
avg = (double)sum/count;

if (count > 1) {
	if (avg > 97.0) {
		System.out.println("WOW");}
		else if(avg >=80 && avg > 97.0) {System.out.println("good job!");}
		else {System.out.println("try next time");
}
	}

System.out.println("your final avg is" + " " + avg);
in.close();

	}
	}
	

