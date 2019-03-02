package game;
import game.*;
import game.strategie.*;

public class Player{
	
	private strategie s;
	private int points=0;
	private String name;
	
	
	/**
	 * create a new player
	 * @param name of the player 
	 * @param s strategie of the player 
	 */ 
	public Player(String name,strategie s){
		this.s=s;
		this.name=name;
	}
	
	/**
	 * add points for the player
	 * @param p number of points to add 
	 */
	 public void addPoints(int p){
		 this.points=this.points+p;
	 }
	 
	 
	 /**
	  *  the name of the player 
	  * @return the name of the player 
	  */
	  public String getName(){
		  return this.name;
	  }
	    
	 /**
	  *  the score of the player 
	  * @return the score of the player 
	  */
	  public int getScore(){
		  return this.points;
	  }
	 
	/**
	 * presentation of the player 
	 */
	 public String toString(){
	 return ("name : "+this.name);
	  }
    
    /**
     * playing with a strategie 
     * @return shape geting from strategie of the player 
     */
     public shape play(){
		 return s.choose();
		 } 
    
}		
