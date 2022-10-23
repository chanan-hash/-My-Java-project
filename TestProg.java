// בגרות 2016 שאלה 7, המחלקה הראשית לסעיף ד
package A;

public class TestProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pen a1 = new Pen("red", "aaa", 10.0,5.5);
Pen a2 = new Pen("bbb");
Pen a3 = new Pen("black","ccc",8.0,12.5);

a1.setPrice(15.0);

if(!(a1.isSamePrice(a3)))
	if(a2.isSameMade(a1))
		System.out.println("YES");
	else
		System.out.println("NO");
else 
	System.out.println("OK");

	}

}
