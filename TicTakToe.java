
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
	
	
	}
	
}