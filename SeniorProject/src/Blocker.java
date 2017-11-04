public abstract class Blocker {
    private String direction;
    private int row;
    private int col;
    private int player;
    private boolean dead;

    public Blocker(int row, int col, String dir, int player){
        this.row = row;
        this.col = col;
        direction = dir;
        this.player = player;
        dead = false;
    }
    public abstract void act(int r, int c, String dir, String type);

    public int getRow(){
        return row;
    }
    public int getCol(){
        return col;
    }
    public String getDirection(){
        return direction;
    }
    public int getPlayer(){
        return player;
    }
    public boolean isDead(){
        return dead;
    }
    public void setDead(boolean b){
        dead = b;
    }
}