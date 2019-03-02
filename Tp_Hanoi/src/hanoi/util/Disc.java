/**
 * A Disc with different size to add it to the Tower
 * 
 * @author jc
 * @version 1.0
 */

package hanoi.util;
public class Disc{
	/**
	 * the Disc's size
	 */ 
	private int size;
	
	
	/**
	 * new disc with a defined size
	 * @param  size of the disc
	 */
	public Disc(int size){
		this.size=size;
	}
	
	/**
	 * method to get the size of the disc
	 * @return the size of the disc
	 */  
	public int getSize(){
		return this.size;
	}
	
	/**
	 * compare this to a disc in parametre by their sizes 
	 * @param  d to compare it with this
	 * @return 1 if this is bigger ,-1 if this is smaller , 0 if are equals
	 */   
	public int compareTo(Disc d){
		if (this.size > d.getSize()){
			return 1;
		} else if (this.size < d.getSize()){
			return -1;
		} else 
		    return 0;
		}
		
    /**
     * 	string representation of the disc
     * @return a string representation of this disc
     */ 	
	public String toString(){
		return "the size of this disc is "+this.size ;
	}				
}		
