package potlemon.map;

public class Cellule {
    
    private int x;
    private int y;
    
    public Cellule(int x,int y){
        this.x=x;
        this.y=y;
    }
    
    /**
     * Get the X position of Cellule
     * @return  int
     */
    public int getX(){
        return this.x;
    }
    
    /**
     * Get the Y position of Cellule
     * @return int
     */
    public int getY(){
        return this.y;
    }
}
