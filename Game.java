// ����� 2017 ���� 2


package A;

public class Game {

	private String gamename;
	private int numPlayers;
	private boolean iswater; 

	// ���� ������ ������ ��� ����� ����� ����

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

// ���� ������ �� ������ ���� ����� ���� ��� ����� ����� �� ������ ����� ����� ����� �����

/*public class Country{

	private String countrtName;

	// ����� ���� �������
	public static int size = 43; //���� �������
	private Game [] game; // ���� ������� ������� �� ������ �� ������� ����
	private int lastgame; // ������ �����

	// �����
	public Country (String name) {
		this.countrtName = name;
		this.game = new Game[size];
		this.lastgame = 0;
	}	

	// ��� ����� ������ ������
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

