// מחלקה הקשורה לשאלה 8 בגרות 2016

package A;

public class Family {

	private int num; // מספר המשתתפים מהמשפחה
	private String familyname; // שם המשפה	


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
// סעיף א
	public int calePrice() {
		int sum = 100;
		if (this.num<=3) {
			sum += 30 * this.num; // מספר אנשי המשפחה, התשלום כפול מספר אנשי המשפחה + הסכום ההתחלתי שזה 100
		}else { if (this.num <=5) {
			sum += 28 * this.num;
		}else {
			sum += 26 * this.num;
		}
		}
		return sum;
	}
}
/* אפשר לעשות את זזה גם ע"י שימוש ב switch case
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
