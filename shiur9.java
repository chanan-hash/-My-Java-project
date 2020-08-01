package trainning;
import java.util.Scanner;
import java.util.Random;

public class shiur9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
Random r = new Random();

int[] n = new int[1000];
int count = 0;
boolean found = false;
  


for (int g = 0; g<n.length; g++) {
	
	n[g] = r.nextInt(1000) + 1;// generates between 1-1000
}	

for (int g = 0; g<n.length; g++) {	
count++;	
if (n[g]== 1) found = false;


}
	
	print("number of steps" + count);
	count = 0;
	found = true;
	
	count = findOne(n);
	print("number of steps" + count);
	
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
	public static int findOne (int[] numbers) {
int count = 0;
for (int g = 0; g<numbers.length; g++) { 
count++;
	if (numbers[g] == 1) return count;
	}
return -1;
	}
	
}
