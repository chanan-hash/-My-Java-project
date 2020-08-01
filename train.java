package trainning;
import java.util.Scanner;

public class train {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in= new Scanner(System.in); 	
Double d1, d2 , sum, dif, modulo;
System.out.println("put in the 1st number");
d1 = in.nextDouble();
System.out.println("put in the 2sd number");
d2 = in.nextDouble();
in.close();
sum = d1 + d2;
dif = d2 - d1;
modulo = d2 % d1;
System.out.print("the sum is:" + sum + "  ");
System.out.println("the dif is" + dif );
System.out.println("the modulo is:" + modulo + " !");
	}
	


}
