package trainning;
import java.util.Scanner;
public class shiur21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
		
Animal[] an = new Animal[3];		
		
an[0] = new Cat(30, 30, "red", 5, 5, 5, 10);		
an[1] = new Cat(30, 30, "red", 5, 5, 5, 10);		
an[2] = new Dog(30, 30, "red", 5, 5, "nothing", "nothig2", true);		
		
for (Animal an1 : an) {
an1.print("hello");	
}		
				
		in.close();
	}

}
