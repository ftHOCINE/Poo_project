
package goosegame;

/**
 *
 * allready dovumented in basicCell
 */
public interface Cell {
public boolean canBeLeft();
public void welcomePlayer(Player p);
public int handleMove(int m);
public boolean isBusy();
public Player getPLayer();
public String toString();
public int getIndex();
}
