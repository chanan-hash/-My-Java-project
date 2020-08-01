package trainning;
import java.util.Scanner;
import java.util.Random;
public class marachim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
Random r =new Random(); 

int [] grade;
int zugi =0, notzugi = 0;

grade = new int [100];

for (int v = 0 ; v<grade.length; v++) {
	grade[v] = r.nextInt(100) +1;
	if (grade[v] % 2 == 0) {zugi++;}

	else {notzugi++;}
	System.out.println(grade[v]);	
}

System.out.println("zugi:"+" "+zugi);
System.out.println("notzugi:" +" "+ notzugi);



in.close();		
	}

}
