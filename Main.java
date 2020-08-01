package A;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
IEat22[] things = new IEat22[3]; 
	
things[0] = new Cat(13);
things[1] = new Person ("Shlomy");
things[2] = new Dog ("Woof");
	
for (IEat22 eat1 : things){	
eat1.eat("Salami");	
		
	}
	}
}