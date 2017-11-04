import java.util.Scanner;

public class Main {
	private static int row1 = 0;
	private static int col1 = 14;
	private static int row2 = 29;
	private static int col2 = 14;
	private static Blocker b1;
	private static Blocker b2;
	private static Board board;
	private static boolean true1 = false;
	private static boolean true2 = false;
	private static String abc;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		boolean gameWon = false;
		board = new Board();
		while(!gameWon){
			b1 = player1(row1,col1);
			if(board.getBoard()[b1.getRow()][b1.getCol()]==null){
				System.out.println("Set 1");
				true1 = true;
			}
			gameWon = board.move(b1);
			System.out.println("Game won p1: " + gameWon);
			if(!b1.isDead()&&true1){
				row1 = b1.getRow();
				col1 = b1.getCol();
			}
			ButtonGrid(30,30,board);
			//board.print();//makes new ButtonGrid with 2 parameters
			System.out.println("row1: " + row1);
			System.out.println("col1: " + col1);
			System.out.println("Press any key for next turn");
			if(!gameWon)
				abc = in.nextLine();
			b2 = player2(row2,col2);
			if(board.getBoard()[b2.getRow()][b2.getCol()]==null && !b2.isDead()){
				System.out.println("Set 2");
				true2 = true;
			}
			gameWon = board.move(b2);
			System.out.println("Game Won p2: " + gameWon);
			if(!b2.isDead()&&true2){
				row2 = b2.getRow();
				col2 = b2.getCol();
			}
			board.print();//makes new ButtonGrid with 2 parameters
			System.out.println("row2: " + row2);
			System.out.println("col2: " + col2);
			Blocker[][] a = board.getBoard();
			System.out.println("Press any key for next turn");
			if(!gameWon)
				abc = in.nextLine();
		}
		System.out.println("You Win!!!");
	}
	public static Blocker player1(int row, int col){
		//Player can use a total of 25 lines of code of standard java syntax, the player may use
		//the methods .getPlayer, .getRow, .getCol, .getDirection, and .length. The following keywords
		//are available, if/else if, instanceof, while, for, you may NOT access any tiles more than
		//2 spaces(one diagonal counts as one space as well as one horizontal/vertical counts as one)
		//from any tile adjacent to one of your pre-existing tiles Note: Origin position is [0][14]

		Blocker b = new Attack(row +1, col, "South", 1);
		return b;
	}
	public static Blocker player2(int row, int col){
		//Player can use a total of 25 lines of code of standard java syntax, the player may use
		//the methods .getPlayer, .getRow, .getCol, .getDirection, and .length. The following keywords
		//are available, if/else if, instanceof, while, for, you may NOT access any tiles more than
		//2 spaces(one diagonal counts as one space as well as one horizontal/vertical counts as one)
		//from any tile adjacent to one of your pre-existing tiles Note: Origin position is [29][14]

		/*if(col < board.getBoard()[0].length - 1)
            b = new Attack(row-1, col+1, "West", 2);
        else
            b = new Attack(row-1, col-1, "East", 2);
		 */
		
		Blocker c = new Attack(row -1, col, "North", 2);
		return c;
	}
}