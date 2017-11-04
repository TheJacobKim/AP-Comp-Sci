import java.awt.Color;

import javax.swing.JFrame;

public class Pong extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3504739896597314995L;
	private final static int WIDTH = 700, HEIGHT = 450; //window dimensions
    private PongPanel panel; //a panel variable

    public Pong() {
        setSize(WIDTH, HEIGHT); //set the size to the variables above
        setTitle("Pong");//Title of the window
        setBackground(Color.WHITE);
        
        /*White background 
         *EDIT : SETTING THIS TO BLUE RUNS THE PROGRAM FOR NO REASON 
         *EDIT2: FOR SOME REASON CHANGING THIS EVERY TIME BEFORE I RUN IT WORKS
         *EDIT3: AHHHHHHH
         *EDIT4: setBackground(Color.WHITE); this was in the code. broke it, it's sinced been removed
         *EDIT5: STILL BROKEN
        */
        setResizable(false);//Cant change the window
        setVisible(true);//Make the window visible
        setDefaultCloseOperation(EXIT_ON_CLOSE);; //i tried this to close the program didnt work
        panel = new PongPanel(this);//a new panel to hold all this junk
        add(panel);
    }

    public PongPanel getPanel() { //returns the panel for other classes
        return panel;
    }

    public static void main(String[] args) {//the run method
        new Pong();
    }
}