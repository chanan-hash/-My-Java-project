// בגרות 2015 שאלה 7

package A;
import java.util.Scanner;
public class number7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);



System.out.println("מחיר חבילה 1 ");
int rate0 = in.nextInt();

System.out.println("מחיר חבילה 2 ");
int rate1 = in.nextInt();

System.out.println("מחיר חבילה 3 ");
int rate2 = in.nextInt();

int package0= 0, package1=0, package2=0;

String name;
int packageCode, topay =0;

while (package0 <500 && package1<500 && package2<500) {
	System.out.println("שם   ");

	name = in.next();

	System.out.println("בחר מספר חבילה סלולר 1, 2, או 3");
	packageCode = in.nextInt();

	switch(packageCode) {
	case 1: package0 ++; topay = rate0; break;
	case 2: package1 ++; topay = rate1; break;
	case 3: package2 ++; topay = rate2; break;
	
	}
	System.out.println(" name: " + name + " package price: "+ topay);
	
}
	}

}
