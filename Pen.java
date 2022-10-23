// ����� 2016 ��� �' ���� 7

package A;

public class Pen {

private String color;// ��� ���
private String made;// �� �����
private double price; // ���� ���
private double weight; // ���� ���

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
// �� ���� ����� ������ ���� �����, ���� ���� ���� ������ �� ������ ������ �� ��� �������� ����� ���, ��� �� ��� ����� ���. ��� ����� �� ����� �� == �� ����� ����� �� ������, ��� ������ ���� ���� ���� ����� ������ ������ ����� 9 ����� �����
public boolean isSamePrice(Pen other) {
	return this.price == other.price;
}


}
