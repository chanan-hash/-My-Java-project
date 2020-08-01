package A;

public abstract class Animal implements IEat22 {

protected int height; 	
protected int weight;	

public Animal () {

	this.height = 120;
	this.weight = 30;
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}

public int getWeight() {
	return weight;
}

public void setWeight(int weight) {
	this.weight = weight;
}

public void eat () {
	System.out.println("I have eaten something");
}



}
