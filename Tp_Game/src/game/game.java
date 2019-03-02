
package game;
import game.*;

/**
 * this class unroll the game 
 */ 

public class game{
	
	private int nbTours;
	private Player p1;
	private Player p2;
	
	/**
	 * creation of new game 
	 * @param p1 first player
	 * @param p2 second player
	 * @param nb number of tours
	 */ 
	public game(Player p1, Player p2,int nb){
		this.nbTours=nb;
		this.p1=p1;
		this.p2=p2;
	}
	/**
	 * play one round and give a point to the winner
	 */ 
	private void playOneRound(){
		System.out.println("New Round");
		shape c1=p1.play();
		shape c2= p2.play();
		System.out.println("Le joueur "+ this.p1 +" a jouer "+c1);
		System.out.println("Le joueur "+ this.p2 +" a jouer "+c2);
		int comp=c1.compare(c2);
		this.givePoints(comp);
		}
	/**
	 * distribute points for players
	 * @param res result of comapre	
	 */ 
	private void givePoints(int res){
		if (res==1){
			this.p1.addPoints(2);
		}else if (res==-1){
			this.p2.addPoints(2);
		}
		else{
			this.p1.addPoints(1);
			this.p2.addPoints(1);
		}
	}
	/**
	 * return true if the game is finish
	 *@return true if the game is finish
	 */
	 private void endOfgame(){
		if(p1.getScore()>p2.getScore())
			System.out.println("the winner is "+this.p1);
		else if(p1.getScore()<p2.getScore())
			System.out.println("the winner is "+this.p2);
		else
			System.out.println("there is no winner ");
		}	
		 
	/**
	 * get the number of tours
	 * @return the number of tours
	 */
	 public int getNbTours(){
		 return this.nbTours;
	 } 	   
	
	/**
	 * unroll the game
	 */ 	
	public void playGame(){
		for(int i=0;i<this.nbTours;i++){
			this.playOneRound();
		}
		this.endOfgame();
		}	
}				
	
