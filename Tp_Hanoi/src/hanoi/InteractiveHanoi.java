

package hanoi;
import hanoi.hanoi;
import hanoi.HanoiInput;

/**
 * cette class permet a l'utilisateur de jouer en choisissant le nb de  discs 
 */
public class InteractiveHanoi{
	/**
	 * execution of the game
	 * @param args[] of nb of discs
	 */ 
	public static void main(String args[]){
		int nb = Integer.parseInt(args[0]);
		hanoi game= new hanoi(nb);
		game.display();
		HanoiInput input = new HanoiInput();
		System.out.println("veuillez saisir le mouvement svp (exp :gc de gauvhe au centre)  ou quitter (quit)  ");
		input.readInput();
		while (input.isMove()) {
			game.moveOneDisc(input.getFrom(),input.getTo());
			game.display();
			if (game.getTower(2).getNbDisc()== nb){
				System.out.println("you win !!!!");
				break;
			 }
			System.out.println("veuillez saisir le mouvement svp (exp :gc de gauvhe au centre)  ou quitter (quit)  ");
			input.readInput();
			}
			System.out.println("bye bye");
} 
}

