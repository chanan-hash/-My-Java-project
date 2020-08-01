package trainning;
import java.util.Scanner;
public class lesseon8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in =new Scanner(System.in);
		
int[] nums = new int [1000];
		int h = 0;
System.out.println("enter a number");	

h = in.nextInt();
 
for (int i = 0; i<nums.length; i++) {	
	System.out.println("enter grade number" +" "+ i +":");
	h = in.nextInt();
	break;	
	
}
		





in.close();
	}

}
