
package goosegame;


public class BasicCell implements Cell {
    protected int index ;
    protected Player player;
	/**
	 * create a basic cell
	 */
   public BasicCell(int index){
       this.index=index;
   }
	/**
	 * get the index of the cell
	 * @return the index of the cell
	 */    	
   public int getCell(){
       return this.index ;
   }
   	/**
	 * true if the cell can left the player to go
	 *@return true if he can left false if not 
	 */   
   public boolean canBeLeft(){
       return true ;
       
   }
    	/**
	 * add a player to a cell 
	 * @param p player to add to  the cell
	 */
  public void welcomePlayer(Player p){
      this.player=p;
  }
  	/**
	 * return the next position of the player after random 
	 * @param m the result of the random
	 * @return the index of the next cell where the player go
	 */    
  public int handleMove(int m){
      return m;
  }
   	 
	/**
	 * return true if the cell is occupated
	 * @return true if the cell is occupated false  if not
	 */
  public boolean isBusy(){
      return player!=null;
  
  }
   	/**
	 * get the player wich is in the cell
	 *@return the player wich is in the cell
	 */  
  public Player getPLayer(){
    return this.player ;
    
}
        	/**
	 * description of the cell in the game
	 *@return string to descript the situation of the player in the cell
	 */    
  public String toString(){
      return "";
  }

    /**
	 * get the index of the cell
	 * @return the index of the cell
	 */ 	
    public int getIndex() {
        return this.index;
    }
  }
