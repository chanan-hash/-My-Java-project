// בגרות 2017 שאלה 2


package A;

public class Game {

	private String gamename;
	private int numPlayers;
	private boolean iswater; 

	// בנאי תכונות כלליות ללא הגדרת ברירת מחדל

	public Game(String gamename, int numPlayers, boolean iswater) {

		this.gamename = gamename;
		this.numPlayers = numPlayers;
		this.iswater = iswater;
	}

	public String getGamename() {
		return gamename;
	}

	public void setGamename(String gamename) {
		this.gamename = gamename;
	}

	public int getNumPlayers() {
		return numPlayers;
	}

	public void setNumPlayers(int numPlayers) {
		this.numPlayers = numPlayers;
	}

	public boolean isIswater() {
		return iswater;
	}

	public void setIswater(boolean iswater) {
		this.iswater = iswater;
	}



}

// צריך להגדיר את המחלקה הזאת בקובץ נפרד אבל באותה חבילה עם המחלקה למעלה שידעו לאיפה לפנות

/*public class Country{

	private String countrtName;

	// הגדרת אוסף המשחקים
	public static int size = 43; //מספר המשחקים
	private Game [] game; // מערך המשחקים שכוללים את התכונה של המחלקהל מעלה
	private int lastgame; // משחקים בפועל

	// הבנאי
	public Country (String name) {
		this.countrtName = name;
		this.game = new Game[size];
		this.lastgame = 0;
	}	

	// האם מדינה משתתפת בבחינה
	public boolean isParticipate (String name) {
		int i = 0;
		while (i< this.lastgame) {
			if(this.game[i].getGamename().equals(name))
				return true;
			i++;
		}
		return false;
	}

}
*/

