
package goosegame;

public class TrapCell extends BasicCell{

   /**
   *create a trap Cell
   */
    public TrapCell(int index) {
        super(index);
    }
    /**
    * return if the Cell can be left or not
    *@return boolean
    */
    public boolean canBeLeft(){
       return false ;
    }

    /**
    * return the description of the cell
    *@return String
    */
    public String toString(){
            return super.toString() + "(Piege)";
    }
}
