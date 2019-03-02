package game.strategie;
import game.*;
import game.util.*;
import java.io.IOException;
public class strategie3 implements strategie{
	/**
	 * return the shape chosse by the user 
	 * @return shape 
	 */ 
	public shape choose(){
		boolean trouve=false;
		while (!trouve){
	      System.out.print("choisissez votre coup 0->ROCK 1->PAPER 2->SCISSOR exp : 1 le coup est PAPER");
	      int intLu;
	      try{
	      intLu = Input.readInt();
	      return shape.values()[intLu];
	      }catch (java.io.IOException e) {
			  System.out.println("veuillez vous entrer un entier svp!!!");
		}
		catch (java.lang.ArrayIndexOutOfBoundsException e){
			 System.out.println("veuillez vous entrer un entier entre 0 et 2 svp!!!");
		 }
		 trouve=false;}
		return shape.values()[0];	
		//shape v;
		//try{
		//v=shape.values()[intLu];
	    //}
	    //catch (java.lang.ArrayIndexOutOfBoundsException e){
			//System.out.println("veuillez vous entrer un entier entre 0 et 2 svp");
		//}
		//return v;
    }
}
