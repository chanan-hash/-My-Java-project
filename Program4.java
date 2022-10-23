// בגרות 2016 שאלה 4ת מחלקה ראשית
package A;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Worker w1 = new Worker("Moshe", 10800);
		Worker w2 = new Worker("Haim", 4800);
		
		if (w1.isBig()&& w2.isBig())
			System.out.println("Happy");
		else {
			System.out.println("Unhappy");
			if(!w1.isBig())
				System.out.println(w1.getName());
			if(!w2.isBig())
				System.out.println(w2.getName());
		}
	}

}
