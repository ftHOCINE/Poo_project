/*
 * functions already documted in basicCell
 */
package goosegame;

public class StartCell implements Cell{
    protected int index;
    public StartCell(){
    this.index = 0;
    }
   
    public boolean canBeLeft() {
        return true;
    }

   
    public void welcomePlayer(Player p) {
        
    }

   
    public int handleMove(int m) {
        return m;
    }

   
    public boolean isBusy() {
        return false; 
    }

    
    public Player getPLayer() {
        return null;    }
    
   
    public int getIndex() {
        return this.index;
    }
    
}
