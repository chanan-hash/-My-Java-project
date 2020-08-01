package trainning;
import java.util.*;
public class shiur8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner in = new Scanner(System.in);
int n1, n2,n3, sum, sum2 ;		
System.out.println("enter a number");		
n1 = in.nextInt();
if (zugi(n1)) {print("zugi");
}else {print("notzugi");
}

print("enter number 2");
n2 = in.nextInt();
print("enter number 3");
n3 = in.nextInt();

sum = sumnumbers (n1,n2);
sum2 = sumnumbers (n1,n2,3);

print(sumnumbers(3, 2));
print(sumnumbers(5,5,1));

in.close();


	}
public static int sumnumbers(int number1, int number2){
return number1 + number2;
}

public static int sumnumbers(int number1, int number2, int number3){
return number1 + number2 + number3;
}



public static boolean zugi(int number) {
return number %2 ==0;	 
}

public static void print (String s) {
	System.out.println(s);
}

public static void print (int d ) {
	System.out.println(d);
}
}

