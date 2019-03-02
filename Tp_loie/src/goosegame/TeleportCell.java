
package goosegame;


public class TeleportCell extends BasicCell{
protected int jumpIndex;

    /**
    *create a Teleport Cell
    */
    public TeleportCell(int index,int jumpIndex){
        super(index);
	       this.jumpIndex=jumpIndex;
       }

        /**
        * return the index of the new Cell
        *@return int
        */
        public int handleMove(int m){
	           return super.handleMove(m+jumpIndex);
           }

           /**
           * return the description of the cell
           *@return String
           */
      public String toString(){
	         return super.toString() + "(Teleportation "+ jumpIndex+")";
         }
}
