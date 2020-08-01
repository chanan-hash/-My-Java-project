package A;

public class Map {

	private Tile[][] tiles;

	private int time;


	public Map (int width ,int height ) {
		tiles = new Tile [height ][width];
		time = 0;
		for(int i = 0; i<tiles.length; i++) {
			for (int j = 0; j<tiles[0].length; j++) {
				tiles[i][j] = new Tile(j,i);
				time++;				
			}
		}
	}


	public String toString() {
		String info = "";
		for(int i = 0; i<tiles.length; i++) {
			for (int j = 0; j<tiles[0].length; j++) {
				info += tiles[i][j].toString() + "\n";

			}
		}
		return info;	
	}

	public void printSomething() {
		System.out.println("This is the map!");	
	}


	// This is the Tile class	

	public class Tile{
		private int x;
		private int y;
		private int id;		


		public Tile (int x, int y) {
			this.x =x;
			this.y = y;

			id = time / 3 * 5;
		}	

		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void setX(int x) {
			this.x = x;
		}
		public String toString() {
			return "X = " + x + ", Y = " + y + ", ID = " + id;
		}
	}
}
