import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
int d1, d2 , sum, dif, modulo;
System.out.println("enetr num1");
d1 =in.nextInt();
System.out.println("enter num2");
d2 = in.nextInt();
in.close();
sum = d1 * d2; 
dif = d2 / d1;
modulo = d1 % d2;
System.out.println("the sum is: " + sum +" !" );
System.out.println("the dif is: " + dif + " !");
System.out.println("the modulo is:" + modulo + " !");
	}

}
