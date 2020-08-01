package trainning;
import java.util.Scanner;
public class yerusha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
//Animal a = new Animal (2, 100, "red");	כי הם אבסטרקט

//Mammal m = new Mammal (70, 90,"White", 2, 3);כי הם אבסטרקט  

Dog d = new Dog(20, 70, "Brown", 1, 5, "Pincher", "Willie", false);

Cat c = new Cat(5, 20, "Balck", 2, 1, 30, 50);

//System.out.println(m.getMilkProduction() + " L");
//System.out.println(m.getHeight() + " cm");
System.out.println(d.getMilkProduction());
System.out.println(d.getColor());
System.out.println(c.getColor());
System.out.println(c.getMustacheLength());

System.out.println(d);
in.close();	
	}

}
