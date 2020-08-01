package trainning;
import java.util.Scanner;
import java.util.Random;

public class marachim2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	
	int[][] matrix = new int[10][10];
	
	for(int i = 0; i<matrix.length; i++) {
			for(int j = 0; j<matrix[i].length; j++){
			matrix[i][j] = new Random().nextInt(100) + 1;
			 
			}
	}
	System.out.println(cal(matrix));
	
	in.close();
	}
public static int cal (int[][] mat ){	
int sum = 0; 
for(int i = 0; i<mat.length; i++) {
	for(int j = 0; j<mat[i].length; j++){
 sum += mat[i][j];
	}
}
	return sum;
}
}

