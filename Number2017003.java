// 2017 Bagrut (final exam) question 3 

// ��� ������� ���� �� "����� �� ��������, (���� = �����) ����� ������ �� ������� �������� �� ����� ������, ������ ������ �� �� 1 ����� ���� ���� ���� ����� ������

package A;

public class Number2017003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(������ ������ �� �� 1 ����� ����� ���� ����� ����� ������) .n ����� �� �������� (���� = �����), ����� ������ �� ������� ��������� ��
		// ���� ������ �� ���� ������ �� ����� ����, �� �������� ����� ���� ���� �����
		// we need to set an array which will have enough cells or to make an unlimited array
		
		int n = 15;
		int[] a = new int [100];
		int i,j;

		for (i=1; i<=n;i++) {
			// ���� ������� ���� ����� ����� �����
			// index number becomes a regular number
			a[i] = i;
		}

		for (i=2; i<n; i++) {
			if (a[i]!=0) {

				for (j=i+1; j<=n; j++) {
					if (a[j]% a[i]==0) {
						a[j] = 0;
					}
				}
			}
		}

		for (i = 1; i<=n; i++) {
			if (a[i]!=0) {
				System.out.println(a[i]);
			}
		}
	}
}
