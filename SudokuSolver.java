package A;

import java.net.PasswordAuthentication;
import java.util.concurrent.ConcurrentHashMap;

public class SudokuSolver {

	// constant for the grid 9x9
	private static final int GRID_SIZE = 9;


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// two dimensional array for the board
		int[][] board = {
				{7,0,2,0,5,0,6,0,0},
				{0,0,0,0,0,3,0,0,0},
				{1,0,0,0,0,9,5,0,0},
				{8,0,0,0,0,0,0,9,0},
				{0,4,3,0,0,0,7,5,0},
				{0,9,0,0,0,0,0,8,0},
				{0,0,9,7,0,0,0,0,5},
				{0,0,0,2,0,0,0,0,0},
				{0,0,7,0,4,0,2,0,3}
		};


		System.out.println("the unsolved board: \n" );
		printboard(board);
		System.out.println();
		//		System.out.println(board);

		if (solveBoard(board)) {
			// if it returns true - so we know that the board was successfully solved
			System.out.println("Solved successfully!");
		}
		else {
			// if it couldn't solve the board it most likely because the board that was entered, wan't a valid board in the first place 	
			System.out.println("Unsolvable board :(");
		}
		// printing the board to prove that we've solved the board
		System.out.println("the solved board:" + "\n");
		printboard(board);
	}

	// until here this is the main method that execute the code
	// from here is the method we have created to help solving the board

	private static void printboard(int[][] board) {
		// TODO Auto-generated method stub
		// we want after every 3 rows to put a line underneath, and after every 3 columns to put also a line, so the board will look nicer
		for (int row = 0; row < GRID_SIZE; row++) {
			// that how we count after 3 rows
			if (row % 3 == 0 && row != 0) {System.out.println("----------");
			}
			for(int column = 0; column < GRID_SIZE; column++) {
				if (column % 3 == 0 && column != 0) {
					System.out.print("|");
				}
				System.out.print(board[row][column]); 
				// only 'print', and not 'println', because we want to print the whole row in the same, row and not to go down\enter every number

			}
			// printing a new line after every row
			System.out.println();
		}

	}

	/* method for checking if the number is already exist in the row
 It will be a boolean method so it returns 'true' if the number is in the row
 The method take 3 parameters - 
 1. the board it self,
 2. the number we want to check,
 3. the number of the row we're checking (0-8)
	 */		

	private static boolean isNumberInRow (int[][] board1, int number, int row) {
		for (int i = 0; i< GRID_SIZE; i++) {
			//
			/* we are checking the matrix board the row number (left one), and the number in the row (i, the right one)
	 			if it is equals to the number we are looking for
			 *if we are giving the func' row = 2, it will look at
			 * 2,0
			 * 2,1
			 * 2,3...
			 * 2,7
			 * 2,8
			 */  
			if (board1[row][i] == number) {
				return true;
			}
		}
		return false; // if we didn't find the number in the row, and now we know that maybe we can use that number depending on the column and grid/square checking
	}


	private static boolean isNumberInColumn (int[][] board1, int number, int column) {
		for (int i = 0; i< GRID_SIZE; i++) {
			//
			/* we are checking the matrix board and the row 'i' (left one), and the column number the (right one) 
	 			if it is equals to the number we are looking for
			 *if we are giving the func' column = 0, it will look at
			 * 0,0
			 * 1,0
			 * 2,0...
			 * 7,0
			 * 8,0
			 */  
			if (board1[i][column] == number) {
				return true;
			}
		}
		return false; // if we didn't find the number in the column, and now we know that maybe we can use that number depending on the column and grid/square checking
	}	


	// we will take here not only the column but rather the row, to get the exact coordinate of the number
	private static boolean isNumberInBox (int[][] board1, int number, int row, int column) {

		// to get the top left corner of the box
		int localBoxRow = row - row % 3; 
		int localBoxColumn = column - column % 3; // those to calculates works for any box in the board/grid

		// we want to go over only on the grid it self, so we are starting from the top left corner the we've got from the variables,
		// and going only 3 steps, because the size of the grid is 3X3
		for (int i = localBoxRow; i< localBoxRow + 3; i++) {
			for (int j = localBoxColumn; j< localBoxColumn + 3; j++) {
				if (board1[i][j] == number) //as same as before, checking if the number if that specific spot/row and column is equals to the number we're looking for  
				{
					return true;
				}
			}	
		}// if we went over that entire nested loop and didn't find it we'll return false
		return false;	
	}

	// A method that will call all 3 checking functions we've written, it is more convenience
	private static boolean isValidPlacment (int[][] board, int number, int row, int column) {
		// we don't want the method to return true, because to put a number in the board we need the palce to be "clean" , to know that no number is int the area
		// so if this method return false, we know the spot is valid and we can put our number
		return !isNumberInRow(board, number, row)&&
				!isNumberInColumn(board, number, column)&&
				!isNumberInBox(board, number, row, column);
	}

	// At first we are going to traverse the board and check each square if it has a number or valid. if it is valid we will use our method we've written
	// this is slight different from how is a human will play sudoku
	// and still we will backtracking 

	private static boolean solveBoard (int[][] board) {
		// nested forloop so we can loop through the entire grid
		for (int row = 0; row < GRID_SIZE; row++) {
			for(int column = 0; column < GRID_SIZE; column++) {
				// in our case a blank, is a zero on the board
				if (board[row][column] == 0) {
					// we're start trying every number between 1-9 and see if it valid
					// another nested for loop 11:30
					for (int numberToTry = 1; numberToTry <= GRID_SIZE; numberToTry++) {
						// we will activate our method 'isvalid' to see if that number in that place is valid
						if (isValidPlacment(board, numberToTry, row, column)) {
							// if it is a valid placement we'll place the number, because we've made all our checking
							board[row][column] = numberToTry;
							// now after we have placed the number we are trying in this spot, now comes the recursion of the algorithm
							if(solveBoard(board)) {
								return true; // if the recursive succeeded. 
								/* so we will go through all of this code again. 
							why we are doing this? because after we've put a number in a valid placement, we continue to check the rest of the row for a valid placement to try a number.
							in the video he explains that at 12:43-13:29
								 */ 
							}
							else { // if the recursive didn't succeed, we want to clear that spot\that placement we have tried, and setting it back to zero. 
								board[row][column] = 0; // after we've put a number, we trying to solve the rest of the board,
								//  and the we figured that that number we have tried dosen't really work, even though it is valid right now we can't solve the rest of the board, so we are clearing the place
								// and then we are going to the next iteration of the loop here and trying another number
							}
						}
					}return false; // if we didn't find any valid placement , unable to put a number in a certain spot
				}
			}
		}
		return true; // in the end of the method if the number is fine so we want to return true
	}
	// the recursion and the methods are allowing us backtracking to perhaps change numbers according to the solving 
	// and now we need to call that method to solve our board in our main method
}