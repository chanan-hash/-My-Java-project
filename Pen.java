// בגרות 2016 חלק א' שאלה 7

package A;

public class Pen {

private String color;// צבע העט
private String made;// שם היצרן
private double price; // מחיר העט
private double weight; // משקל העט

public Pen (String made) {
	this.color = "red" +"";
	this.made = made;
	this.price = 10.0;
	this.weight = 25;
}

public Pen (String color,String made, double price, double weight) {
	this.color = color;
	this.made = made;
	this.price = price;
	this.weight = weight;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getMade() {
	return made;
}

public void setMade(String made) {
	this.made = made;
}

public double getPrice() {
	return price;
}

public void setPrice(double x) {
	this.price = x;
}

public double getWeight() {
	return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}


public boolean isSameMade(Pen other) {
	return this.made == other.made;
}
// לא צריך לעשות לפעולה כזאת תנאים, בגלל שהיא מסוג בוליאן אם מתקיים שוויון אז היא אוטומטית תחזיר אמת, ואם לא היא תחזיר שקר. לכן אנחנו גם עושים פה == כי אנחנו מדברי על שוויון, סוג הפעולה הזאת יכול מאוד לעזור בבניית המחלקה בשאלה 9 באותה בגרות
public boolean isSamePrice(Pen other) {
	return this.price == other.price;
}


}
