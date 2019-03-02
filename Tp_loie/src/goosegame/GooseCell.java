package goosegame;

public class GooseCell extends BasicCell{
  /**
  *create a Teleport Cell
  */
  public GooseCell(int index){
	   super(index);
   }
   /**
   * return the index of the new Cell
   *@return int
   */
   public int handleMove(int m){
	    return super.handleMove(m*2);
    }

    /**
    * return the description of the cell
    *@return String
    */
    public String toString(){
	     return super.toString() + "(Oie)" ;
     }
}
