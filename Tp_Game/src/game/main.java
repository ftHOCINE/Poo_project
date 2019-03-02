package game;
import game.*;
import game.strategie.*;
public class main{

public static void main(String args[]){
	Player p1 =new Player("p1",new strategie1());
	Player p2 =new Player("p2",new strategie3());
	game partie= new game(p1,p2,3);
	partie.playGame();
}
}
	
