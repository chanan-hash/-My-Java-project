package A;

public class Shiur31Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Eatable e = new Eatable() {
			public void eat() {
				System.out.println("mmmm, yumi!");
			}	
		};

		Map m1 = new Map(5,5); 

		Map m = new Map(5,5) {
			public void printSomething() {
				System.out.println("this is overridden method!");
			}

			public String toString (){
				return "Another toString method" ;
			}

		};


		e.eat();

		m1.printSomething();
		System.out.println(m1);

		m.printSomething();
		System.out.println(m);
	}
}
