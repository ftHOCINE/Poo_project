/**
 * A Tower with capaity of taking discs 
 * 
 * @author jc
 * @version 1.0
 */
package hanoi.util;
public class Tower{
	/**
	 * number of discs in towers
	 */  
	private int nbDiscs;
	/**
	 * array of discs in this tower
	 */ 
	private Disc[] theDiscs= new Disc[20];
	
	/**
	 * capacity of discs in this tower
	 */ 
	private int capacity;
	
	/** 
	 * build a new Tower with a capacity of taking discs
	 * @param capacity of the tower 
	 */ 
	public Tower(int capacity){
		this.capacity=capacity;
	}
	
	
	/**
	 * the number of discs in the Tower 
	 * @return the number of discs in the Tower
	 */
	 public int getNbDisc(){
		 return this.nbDiscs;
	 }
	  
	
	/**
	 * the capacity of  the Tower 
	 * @return the capacity  the Tower
	 */
	 public int getCapacity(){
		 return this.capacity;
	 }	
	
	
	/**
	 * puch a disc in a tower if the capacity is available and the existant disc in is smaller  
	 * @param d disc to push it in the tower
	 */
	public void push(Disc d){
		if  ((this.isEmpty())||((!this.isFull() && this.theDiscs[nbDiscs -1].compareTo(d)==1))){
			int nb=this.nbDiscs;
			this.nbDiscs=this.nbDiscs+1;
			this.theDiscs[nb]=d;
		}
		else
			throw new IllegalStateException("invalid push");
		
	}
	
	/**
	 * @return the list of discs 
	*/
	public Disc[] getTheDiscs(){
		return this.theDiscs;
	}
	/** 
	 * True if this tower is full
	 * @return True if this Tower is full false if not
	 */
	 public boolean isFull(){
		 return this.nbDiscs ==this.capacity;
	 }
	 
	/** 
	 * True if this tower is empty
	 * @return True if this Tower is empty false if not
	 */
	 public boolean isEmpty(){
		 return this.nbDiscs ==0;	
	 }	 
     /**
      * the disc of the top of the tower
      * @return	the disc of the top of the tower
      */
     public Disc top(){
		 if (! this.isEmpty()){
			 return this.theDiscs[this.nbDiscs - 1];
		}else{
			throw new IllegalStateException("the tower is empty");	  	 
		}
	}
	
	
     /**
      * the disc of the top of the tower and delete it from the tower
      * @return	the disc of the top of the tower and delete it frm the tower
      */
     public Disc pop(){
		 if (! this.isEmpty()){
			 this.nbDiscs= this.nbDiscs-1;
			 return this.theDiscs[this.nbDiscs];
		}else{
			throw new IllegalStateException("the tower is empty");	  	 
		}
	}
	/**
     * 	string representation of the Tower
     * @return a string representation of the Tower
     */ 		
	public String toString(){
		return "this tower of capacity"+this.capacity+"contain"+this.nbDiscs+"discs"; 
}
}
