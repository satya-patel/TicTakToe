
import java.util.*;
public class TicTakToe{
	
	
	public static void main(String args[]){
			
			//Create a 3x3 array that represents our tic tac toe board
		char[][] board = new char[3][3];
		
			//Initialize our board with dashes (empty positions)
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}
	
	
	
			//Create a Scanner and ask the players for their names
		Scanner in = new Scanner(System.in);
		System.out.println("Let's play Tic Tac Toe!");
		System.out.print("Player 1, what is your name? ");
		String p1 = in.nextLine();
		System.out.print("Player 2, what is your name? ");
		String p2 = in.nextLine();

		//Create a player1 boolean that is true if it is player 1's turn and false if it is player 2's turn
		boolean player1 = true;

		//Create a gameEnded boolean and use it as the condition in the while loop
		boolean gameEnded = false;
		
		while(!gameEnded) {

			//Draw the board
			drawBoard(board);

			//Print whose turn it is
			if(player1) {
				System.out.println(p1 + "'s Turn (x):");
			} else {
				System.out.println(p2 + "'s Turn (o):");
			}

			//Create a char variable that stores either 'x' or 'o' based on what player's turn it is
			char c = '-';
			if(player1) {
				c = 'x';
			} else {
				c = 'o';
			}

			//Create row and col variables which represent indexes that correspond to a position on our board
			int row = 0;
			int col = 0;

			//Only break out of the while loop once the user enters a valid position
			while(true) {
				
				//Ask the user for what position they want to place their x or o
				System.out.print("Enter a row number (0, 1, or 2): ");
				row = in.nextInt();
				System.out.print("Enter a column number (0, 1, or 2): ");
				col = in.nextInt();

				//Check if the row and col are 0, 1, or 2
				if(row < 0 || col < 0 || row > 2 || col > 2) {
					System.out.println("This position is off the bounds of the board! Try again.");
				
				//Check if the position on the board the user entered is empty (has a -) or not
				} else if(board[row][col] != '-') {
					System.out.println("Someone has already made a move at this position! Try again.");
				
				//Otherwise, the position is valid so break out of the while loop
				} else {
					break;
				}
			
			}

			//Set the position on the board at row, col to c
			board[row][col] = c;

			//Check to see if either player has won
			if(playerHasWon(board) == 'x') {
				System.err.println(p1 + " has won!");
				gameEnded = true;
			} else if(playerHasWon(board) == 'o') {
				System.err.println(p2 + " has won!");
				gameEnded = true;
			} else {

				//If neither player has won, check to see if there has been a tie (if the board is full)
				if(boardIsFull(board)) {
					System.err.println("It's a tie!");
					gameEnded = true;
				} else {
					//If player1 is true, make it false, and vice versa; this way, the players alternate each turn
					player1 = !player1;
				}

			}

		}
	
	
	}
	
}