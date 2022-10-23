// OOP H.W  1 Un Ariel
// we need to create a class which will giv random numbers
package A;

public class NewRandom {

	private int previous;
	
	public NewRandom() {
		previous = 1; // a starting number if none is given
	}
	public NewRandom(int start) {
		previous = start; // now the starting number is the previous number, and each time it will change 
	}
	// Function to make the next random number
	public int nextInt() {
		int ans = previous;
		previous = ((previous * 25173) + 13849) % 65536;
		return ans;
	}

}
