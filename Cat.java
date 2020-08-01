package trainning;

public class Cat extends Mammal {

private int mustacheLength;	
private int jumpHeight;	

public Cat (int weight, int height, String color, int mp, int mn, int ml, int jh) {
super(weight, height, color, mp,mn);	

this.mustacheLength = ml;
this.jumpHeight = jh;
}

public int getMustacheLength() {
	return mustacheLength;
}

public void setMustacheLength(int mustacheLength) {
	this.mustacheLength = mustacheLength;
}

public int getJumpHeight() {
	return jumpHeight;
}

public void setJumpHeight(int jumpHeight) {
	this.jumpHeight = jumpHeight;
}
public void print(String s) {	
System.out.println(s);
}

}
