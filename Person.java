package A;

public class Person implements IEat22{

	private String name;
	private String id;

public Person (String name) {
this.name = name + "";
this.id = "0-00000000";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}
public void eat (String food) {
System.out.println(this.name + " has eaten the best " + food + " he coukd find!");	
}

public void eat () {
System.out.println("this person has eaten some weird food");	
}

public void drink (String drink) {
System.out.println("I like " + drink + " !");	
}
public boolean hasEaten() {
return false;
}




}
