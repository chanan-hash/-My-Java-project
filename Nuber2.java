// ����� 2010 ���� 2

package A;

public class Nuber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(car(4));
		System.out.println(vehicle(8));

	}

// ����� ���, ��� ���� ����� ���� �� (���� �� �����, �� ���� ��) ���� ����� �� ��� ��� ��� �����. ���� ���� ���� ����� ������ �� �� ���� �� �����	
	public static char vehicle(int w) {

		if (w == 4)
			return 'c';
		if (w == 8)
			return 'b';
		return 'n';

	}

// ����� ��� ����� �� �� �"� ������ ����

	public static char car(int n) {
		switch (n) {
		case 4:
			return 'c';
		case 8:
			return 'b';
		default:
			return 'n';
		}

	}
}
