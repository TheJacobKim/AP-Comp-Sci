public class Board {
	private Blocker[][] board;
	private Blocker southB;
	private Blocker northB;
	private Blocker westB;
	private Blocker eastB;
	private Blocker player1;
	private Blocker player2;
	public Board(){
		board = new Blocker[30][30];
		player1 = new Player(0, 14, "All", 1);
		player2 = new Player(board.length-1, 14, "All", 2);
		board[player1.getRow()][player1.getCol()]=player1;
		board[player2.getRow()][player2.getCol()]=player2;
	}
	public Blocker[][] getBoard(){
		return board;
	}
	public boolean move(Blocker b){
		boolean gameWon = false;
		boolean dead = false;
		System.out.println("1: ");
		if(b.getRow()!=board.length - 1)
			 southB = board[b.getRow()+1][b.getCol()];
		else
			southB = null;
		
		if(b.getRow()!=0)
			northB = board[b.getRow()-1][b.getCol()];
		else 
			northB = null;
		
		if(b.getCol()!=0)
			westB = board[b.getRow()][b.getCol()-1];
		else
			westB = null;
		
		if(b.getCol()!=board[0].length - 1)
			eastB = board[b.getRow()][b.getCol()+1];
		else
			eastB = null;
		
		if(board[b.getRow()][b.getCol()]!=null){
			//checks if there is already a piece where you are placing
			System.out.println("invalid move, turn skipped, piece already exists");
			return false;
		}
		System.out.println("East: " + eastB);
		System.out.println(b.getCol()!=board[0].length - 1);
		if(b instanceof Neutral){
			System.out.println("Neutral!");
			board[b.getRow()][b.getCol()] = b;
			if((southB != null) && southB instanceof Attack && southB.getDirection().equals("North")&&southB.getPlayer() != b.getPlayer()){
				dead = true;
			}
			else if((northB != null) && northB instanceof Attack && northB.getDirection().equals("South")&&northB.getPlayer() != b.getPlayer()){
				dead = true;
			}
			else if((westB != null) && westB instanceof Attack && westB.getDirection().equals("East")&&westB.getPlayer() != b.getPlayer()){
				dead = true;
			}
			else if((eastB != null) && eastB instanceof Attack && eastB.getDirection().equals("West")&&eastB.getPlayer() != b.getPlayer()){
				dead = true;
			}
			if(!dead){
				System.out.println("Not dead!");
				if(board[b.getRow()][b.getCol()]==null)
					board[b.getRow()][b.getCol()] = b;
			}
		}
		if(dead)
			board[b.getRow()][b.getCol()] = null;
		else if(b instanceof Attack){
			boolean aDead = false;
			if((northB != null) && b.getDirection().equals("North")&& ((northB instanceof Neutral && (!northB.getDirection().equals("South")))|| northB instanceof Attack)&&northB.getPlayer() != b.getPlayer())
				board[b.getRow()-1][b.getCol()] = null;
			else if((southB != null) && b.getDirection().equals("South") && ((southB instanceof Neutral && (!southB.getDirection().equals("North")))||southB instanceof Attack)&&southB.getPlayer() != b.getPlayer())
				board[b.getRow()+1][b.getCol()] = null;
			else if((westB != null) && b.getDirection().equals("West") && ((westB instanceof Neutral && (!westB.getDirection().equals("West")))||westB instanceof Attack)&&westB.getPlayer() != b.getPlayer())
				board[b.getRow()][b.getCol()-1] = null;
			else if((eastB != null) && b.getDirection().equals("East") && ((eastB instanceof Neutral && (!eastB.getDirection().equals("East")))|| eastB instanceof Attack)&&eastB.getPlayer() != b.getPlayer())
				board[b.getRow()][b.getCol()+1] = null;
			if((northB != null) && northB.getDirection().equals("South") && (northB instanceof Attack))
				aDead = true;
			else if((southB != null) && southB.getDirection().equals("North") && (southB instanceof Attack))
				aDead = true;
			else if((westB != null) && westB.getDirection().equals("East") && (westB instanceof Attack))
				aDead = true;
			else if((eastB != null) && eastB.getDirection().equals("West") && (eastB instanceof Attack))
				aDead = true;
			if(!aDead){
				if(board[b.getRow()][b.getCol()]==null)
					board[b.getRow()][b.getCol()] = b;
			}
			
		}
		if(board[0][14]==null){
			System.out.println("Congrats, player1 wins!");
			gameWon = true;
		}
		else if(board[board.length-1][14]==null){
			System.out.println("Congrats, player2 wins!");
			gameWon = true;
		}
		return gameWon;
	}
	public void print(){
		int count = 1;
		for(int r = 0; r < board.length; r++){
			for(int c = 0; c < board[0].length; c++){
				if(board[r][c] == null){
					System.out.print("[---]");
				}
				else if(board[r][c] instanceof Attack){
					if(board[r][c].getDirection().equals("North"))
						System.out.print("[A↑A]");
					else if(board[r][c].getDirection().equals("South"))
						System.out.print("[A↓A]");
					else if(board[r][c].getDirection().equals("West"))
						System.out.print("[A←A]");
					else if(board[r][c].getDirection().equals("East"))
						System.out.print("[A→A]");
				}
				else if(board[r][c] instanceof Neutral){
					if(board[r][c].getDirection().equals("North")){
						System.out.print("[B↑B]");
					}
					else if(board[r][c].getDirection().equals("South")){
						System.out.print("[B↓B]");
					}
					else if(board[r][c].getDirection().equals("West")){
						System.out.print("[B←B]");
					}
					else if(board[r][c].getDirection().equals("East")){
						System.out.print("[B→B]");
					}
				}
				else if(board[r][c] instanceof Player){
					System.out.print("[Pl" + count + "]");
					count++;
				}
				else
					System.out.print("[???]");
			}
			System.out.println();
		}
	}
}

