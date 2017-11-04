public class Player extends Blocker{
    public Player(int row, int col, String dir, int player){
        super(row,col,dir,player);
    }

    @Override
    public void act(int r, int c, String dir, String type) {
        System.out.println("Player can not act");
    }
}