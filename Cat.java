package A;

public class Cat extends Animal implements Comparable <Cat>{

	private int jumpheight;

public Cat (int jumpheight){
	super();
this.jumpheight = jumpheight;
}

public int getJumpheight() {
	return jumpheight;
}

public void setJumpheight(int jumpheight) {
	this.jumpheight = jumpheight;
}

public void eat (String food) {
System.out.println("Meow!!! I have eaten a tasty" + food + " !!" );	
}

public void drink (String drink) {
System.out.println("whoo I like " + drink + " !");	
}
public boolean hasEaten() {
return true;
}

@Override
public int compareTo(Cat o) {
	// TODO Auto-generated method stub
	return this.jumpheight - o.jumpheight;

}

}

