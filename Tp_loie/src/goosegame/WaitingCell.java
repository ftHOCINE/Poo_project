
package goosegame;



public class WaitingCell extends BasicCell{
protected int durationWait;
protected int waitTime;

/**
*create a waiting Cell
*/
		public WaitingCell(int index,int durationWait){
			super(index);
			this.durationWait=durationWait;
		}
		/**
	  * return if the Cell can be left or not
	  *@return boolean
	  */
		public boolean canBeLeft(){
				this.waitTime += 1 ;
				return this.durationWait==(this.waitTime-1);
			}

			/**
			* set a player p to the cell
			*/
			public void welcomePlayer(Player p){
        super.welcomePlayer(p);
				waitTime = 0;


			}
			/**
			* return the description of the cell
			*@return String
			*/
			public String toString(){
				return super.toString() + "(Attente de )" + this.waitTime+" tours";
			}

}
