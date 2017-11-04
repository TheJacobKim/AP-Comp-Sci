import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Racket {
    private static final int WIDTH = 10, HEIGHT = 60; //size of the racket
    private Pong game; //game variable
    private int up, down; //the ints that decide whether or not you're going up or down
    private int x;
    private int y, ya;

    public Racket(Pong game, int up, int down, int x) { //Adds the bracket to the game
        this.game = game;
        this.x = x;
        y = game.getHeight() / 2;
        this.up = up;
        this.down = down;
    }

    public void update() { //updates the state of the bracket
        if (y > 0 && y < game.getHeight() - HEIGHT - 29) 
            y += ya;
        else if (y == 0)
            y++;
        else if (y == game.getHeight() - HEIGHT - 29)
            y--;
    }

    public void pressed(int keyCode) {
        if (keyCode == up) //moving up
            ya = -1;
        else if (keyCode == down) //moving down
            ya = 1;
    }

    public void released(int keyCode) {
        if (keyCode == up || keyCode == down) //no buttons pressed 
            ya = 0;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, WIDTH, HEIGHT); //Return the boundaries of the Rectangle
    }

    public void paint(Graphics g) {
    	g.setColor(Color.black); //Rackets are black
        g.fillRect(x, y, WIDTH, HEIGHT); //Fill the racket
    }
}