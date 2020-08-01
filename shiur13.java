package trainning;
import java.util.Scanner;
import java.util.Random;

public class shiur13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);

car c1 = new car();

Person p = new Person(180,"1234567890", c1);
System.out.println(p.getcar().getMaxSpeed() );
c1.setMaxSpeed(600);
System.out.println(p.getcar().getMaxSpeed() );

	car c2 = new car(p.getcar());
System.out.println(c2);
	in.close();	

	}

}
		