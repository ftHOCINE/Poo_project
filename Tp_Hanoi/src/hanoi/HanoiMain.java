package hanoi;
import hanoi.hanoi;


public class HanoiMain{

	public static void main(String args[]){
		int nb = Integer.parseInt(args[0]);
		hanoi game= new hanoi(nb);
		game.moveNbDiscs(nb,1,2,3);
		}
	}
