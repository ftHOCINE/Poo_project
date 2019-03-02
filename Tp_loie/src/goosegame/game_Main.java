
package goosegame ;

public class game_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	 Board classic= new GameBoard(63);
         Player p1 = new Player("ferhat" , new StartCell()) ;
         Player p2 = new Player("lounis", new StartCell());
         Game game = new Game(classic);
         game.addPlayer(p1);
         game.addPlayer(p2);
         game.playAllPlayers();
    }
    
}
