import javax.swing.JFrame; //imports JFrame library
import javax.swing.JButton; //imports JButton library

import java.awt.Color;
import java.awt.GridLayout; //imports GridLayout library


public class ButtonGrid {

	JFrame frame=new JFrame(); //creates frame
	JButton[][] grid; //names the grid of buttons

	public ButtonGrid(int width, int length, Board b){ //constructor

		Blocker[][] board = b.getBoard();
		
		frame.setLayout(new GridLayout(width,length)); //set layout
		grid=new JButton[width][length]; //allocate the size of grid
		int count = 1;
		
		for(int y=0; y<length; y++){
			for(int x=0; x<width; x++){
				
				if(board[x][y] == null){
					grid[x][y]=new JButton("      "); //creates new button     
					
					grid[x][y].setOpaque(true);
					grid[x][y].setBorderPainted(true);
					frame.add(grid[x][y]); //adds button to grid
				}
				
				if(board[x][y] instanceof Attack){
					if(board[x][y].getDirection().equals("North"))
					{
						grid[x][y]=new JButton("A, North"); //creates new button     
						
						grid[x][y].setOpaque(true);
						grid[x][y].setBorderPainted(true);
						frame.add(grid[x][y]); //adds button to grid
					}
					else if(board[x][y].getDirection().equals("South"))
					{
						grid[x][y]=new JButton("A, South"); //creates new button     
						
						grid[x][y].setOpaque(true);
						grid[x][y].setBorderPainted(true);
						frame.add(grid[x][y]); //adds button to grid
					}
					else if(board[x][y].getDirection().equals("West"))
					{
						grid[x][y]=new JButton("A, West"); //creates new button     
						
						grid[x][y].setOpaque(true);
						grid[x][y].setBorderPainted(true);
						frame.add(grid[x][y]); //adds button to grid
					}
					else if(board[x][y].getDirection().equals("East"))
					{
						grid[x][y]=new JButton("A, East"); //creates new button     
						
						grid[x][y].setOpaque(true);
						grid[x][y].setBorderPainted(true);
						frame.add(grid[x][y]); //adds button to grid
					}
				}

				else if(board[x][y] instanceof Neutral){
					if(board[x][y].getDirection().equals("North")){
						grid[x][y]=new JButton("B, North"); //creates new button     
						
						grid[x][y].setOpaque(true);
						grid[x][y].setBorderPainted(true);
						frame.add(grid[x][y]); //adds button to grid
					}
					else if(board[x][y].getDirection().equals("South")){
						grid[x][y]=new JButton("B, South"); //creates new button     
						
						grid[x][y].setOpaque(true);
						grid[x][y].setBorderPainted(true);
						frame.add(grid[x][y]); //adds button to grid
					}
					else if(board[x][y].getDirection().equals("West")){
						grid[x][y]=new JButton("B, West"); //creates new button     
						
						grid[x][y].setOpaque(true);
						grid[x][y].setBorderPainted(true);
						frame.add(grid[x][y]); //adds button to grid
					}
					else if(board[x][y].getDirection().equals("East")){
						grid[x][y]=new JButton("B, East"); //creates new button     
						
						grid[x][y].setOpaque(true);
						grid[x][y].setBorderPainted(true);
						frame.add(grid[x][y]); //adds button to grid
					}
				}

				else if(board[x][y] instanceof Player){
					System.out.print("[Pl" + count + "]");
					count++;
				}
			}
		}
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack(); //sets appropriate size for frame
		frame.setVisible(true); //makes frame visible
	}
	
}
//public class ButtonGrid {
//	 
//    JFrame frame=new JFrame(); //creates frame
//    JButton[][] grid; //names the grid of buttons
//
//    public ButtonGrid(int width, int length){ //constructor
//            frame.setLayout(new GridLayout(width,length)); //set layout
//            grid=new JButton[width][length]; //allocate the size of grid
//            for(int y=0; y<length; y++){
//                    for(int x=0; x<width; x++){
//                            grid[x][y]=new JButton("A1A"); //creates new button     
//                            frame.add(grid[x][y]); //adds button to grid
//                    }
//            }
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.pack(); //sets appropriate size for frame
//            frame.setVisible(true); //makes frame visible
//    }
//    public static void main(String[] args) {
//            new ButtonGrid(30,30);//makes new ButtonGrid with 2 parameters
//    }
//}
//
