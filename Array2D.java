// ����� ����������� ������� �� �������

package A;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = new int[5][5];

		int count = 0;

		for (int i = 0 ; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {

				arr[i][j] = i*j;
				System.out.print(arr[i][j] + "\t");
				if (arr[i][j]==0){
					count++;
				}
			}
			System.out.println();

		}
		System.out.println("number of Zero: " + count);
		System.out.println("the sum is: "+ sum(arr));
		System.out.println("the sum2 is: " + alchson(arr));
	}


	// ����� ������ �� ���� �����

	public static int sum (int[][] num) {
		int sum = 0;
		for (int i = 0 ; i<num.length; i++) {
			for(int j = 0; j<num[i].length; j++) {
				sum += num[i][j];
			}	

		}
		return sum;

	}
	// ����� ���� ������� ������
	public static int alchson(int array[][]) {

		int sum2 = 0;
		for (int i = 0 ; i<array.length; i++) {
			for(int j = 0; j<array[i].length ; j++) {
			// ����� ����� ��� ����, ����� �� ����� ����� �� ���� ����� ���, �� ����� ����� ���� ���� �� �� ����� ����� ����� �� �����, ���� ����� ���? �"� ����, �� ���� �� ���� ����� ��� ����� �� ���� ����� ����, ��� ������ �� ��� ����� ���� ��� �� ������� ����� ���� ���� �� ���� ����� ���� 
				
				if (j==i)
					// ��� ���� ������ ����� ���� ���� ��, ����� ������ ����� �� ���� �������, �� ����� ����� ����, ��� ��������, ��� ������ ���� [0][0],[1][1],[2][2]�
					sum2 += array[i][j];	
			}

		}
		return sum2;	
	}
}