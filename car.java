package trainning;

public class car {
 
public static int totalID = 0;	
		
private int price;
private int numberOfseats;
private int maxSpeed;
private int id; 
		
private String color;
private String company;
	
public car () {
totalID++;
this.id = totalID;
this.price = 150000;
this.numberOfseats = 5;
this.maxSpeed = 250;
this.color ="red";		
this.company = "Nissan";		
		}

public car (int price, int nos, int max, String clr, String cmp) {
totalID++;
this.id = totalID;
this.price = price;
this.numberOfseats = nos;
this.maxSpeed = max;
this.color = clr;		
this.company = cmp;		
}

public car (car c) {
totalID++;
this.id = totalID;
this.price = c.price;
this.numberOfseats = c.numberOfseats;
this.maxSpeed = c.maxSpeed;
this.color = c.color +"";		
this.company = c.company+ "";		
}

public int getPrice() {
	return this.price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getNumberOfseats() {
	return this.numberOfseats;
}
public void setNumberOfseats(int numberOfseats) {
	this.numberOfseats = numberOfseats;
}
public int getMaxSpeed() {
	return this.maxSpeed;
}
public void setMaxSpeed(int maxSpeed) {
	this.maxSpeed = maxSpeed;
}
public String getColor() {
	return this.color;
}
public void setColor(String color) {
	this.color = color;
}
public String getCompany() {
	return this.company;
}
public void setCompany(String company) {
	this.company = company;
}
public int getid() {
	return this.id;
}
public void setid(int value) {
	this.id = value;
}

public String toString() {
return "Price = " + this.price + "\n" +
		"Number of seats = " + this.numberOfseats + "\n" +
		"max Speed = " + this.maxSpeed +"\n" +
		"color = " + this.color + "\n" + 
		"company = " + this.company + "\n" + 
		"ID = " + this.id + "\n";
}
}
