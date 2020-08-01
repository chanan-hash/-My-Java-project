package trainning;

public class Person {

private int height;

private String id;

private car car;

public Person() {
this.height = 175;
this.id = "0000000000";
this.car = new car();
}
public Person (int height, String id, car c) {
this.height = height;
this.id = id +"";
this.car =  new car(c);
}
public car getcar() {
return this.car;	
}
}
