// 2010 Bagrut (final exam) question 6 

package A;

import java.util.Scanner;

public class Nuber6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int count = 0;
		int kind, top, sum;

		System.out.println("��� ���� ������");		
		int num = input.nextInt();

		while(num !=0 ) {
			count++;

			System.out.println("���� 1 ����� ����� ����, 2 ������ �����");
			kind = input.nextInt();

			System.out.println(" ����� ���� �����? 1 - ��, 2 - ��");
			top = input.nextInt();

			if (kind == 1)
				sum = num * 10;
			else
				sum = num * 12;

			if (top == 1)
				sum = sum + num;

			if (num >= 10)
				sum -=20;

			System.out.println("sum is: " + sum);

			System.out.println("��� ���� ������");		
			num = input.nextInt();

		}
		System.out.println("count = " + count);

		input.close();
	}

}
