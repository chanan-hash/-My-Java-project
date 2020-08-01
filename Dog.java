package A;

public class Dog extends Animal {

		private String voice;

public Dog (String voice) {
super();	
this.voice = voice + "";
}

public String getVoice() {
	return voice;
}

public void setVoice(String voice) {
	this.voice = voice;
}
public void eat (String food) {
System.out.println(this.voice + "mmm this " + food + " war really good!!!");	
}

public void drink (String drink) {
System.out.println(":( I prefer water! " + "( " + drink + ") ");	
}
public boolean hasEaten() {
return false;
}















}
