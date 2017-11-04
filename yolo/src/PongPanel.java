import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class PongPanel extends JPanel implements ActionListener, KeyListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4191545884261698855L;
	private Pong game; //a game
    private Ball ball; //a ball
    private Racket player1, player2; //and some people
    private int score1, score2; //some points too

    public PongPanel(Pong game) {
        setBackground(Color.WHITE); // a white background
        this.game = game; // this game is a game
        ball = new Ball(game); // theres a ball in this game!
        player1 = new Racket(game, KeyEvent.VK_UP, KeyEvent.VK_DOWN, game.getWidth() - 36); //You get a racket
        player2 = new Racket(game, KeyEvent.VK_W, KeyEvent.VK_S, 20); //You get a racket too
        Timer timer = new Timer(5, this); //A timer before we begin
        timer.start(); //Start the clock
        addKeyListener(this);//get ready for some key presses
        setFocusable(true);//Couldn't tell ya what this did, but i get an error if i don't have it
    }

    public Racket getPlayer(int playerNo) {//check on the rackets
        if (playerNo == 1)
            return player1;
        else
            return player2;
    }

    public void increaseScore(int playerNo) {//increase the score if you deserve it for getting the ball past
        if (playerNo == 1)
            score1++;
        else
            score2++;
    }

    public int getScore(int playerNo) {//get some score
        if (playerNo == 1)
            return score1;
        else
            return score2;
    }
    public void setScore(int newScore)
    { 	
    	score1 = newScore;
    	score2 = newScore;
    }

    private void update() {//update the balls movement
        ball.update();
        player1.update();
        player2.update();
    }

    public void actionPerformed(ActionEvent e) {//run the update and repaint the brackets
        update();
        repaint();
    }

    public void keyPressed(KeyEvent e) {//wow you pressed the button now hwat?
        player1.pressed(e.getKeyCode());
        player2.pressed(e.getKeyCode());
    }

    public void keyReleased(KeyEvent e) {//wow you stopped pressing the button now hwat?
        player1.released(e.getKeyCode());
        player2.released(e.getKeyCode());
    }

    public void keyTyped(KeyEvent e) { //if you press other things i aint having that
        ;
    }

    @Override
    public void paintComponent(Graphics g) {//this is a more important painting method
        super.paintComponent(g);
        g.drawString(game.getPanel().getScore(1) + " : " + game.getPanel().getScore(2), game.getWidth() / 2, 10); //displays the score on the screen
        ball.paint(g); //makes sure the ball is in front of the score
        player1.paint(g);//makes sure the bracket is in front of everything
        player2.paint(g);//see above
    }
}