// ����� ������ ����� 8 ����� 2016

package A;

public class Family {

	private int num; // ���� �������� �������
	private String familyname; // �� �����	


	public Family (int num, String familyname) {
		this.num = num;
		this.familyname = familyname;

	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getFamilyname() {
		return familyname;
	}


	public void setFamilyname(String familyname) {
		this.familyname = familyname;
	}
// ���� �
	public int calePrice() {
		int sum = 100;
		if (this.num<=3) {
			sum += 30 * this.num; // ���� ���� ������, ������ ���� ���� ���� ������ + ����� ������� ��� 100
		}else { if (this.num <=5) {
			sum += 28 * this.num;
		}else {
			sum += 26 * this.num;
		}
		}
		return sum;
	}
}
/* ���� ����� �� ��� �� �"� ����� � switch case
 * 
 * int sum = 100;
 * 
 * switch (this.num)
 * 
 * case 1:
 * case 2;
 * case 3: sum = sum + 30 * this.num; break;
 * case 4: 
 * case 5: sum = sum + 28 * this.num; break;
 * default: sum = sum + 26 * this.num;
 * 
 */
