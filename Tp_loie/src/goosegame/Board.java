
package goosegame;


public abstract class Board{
    	protected final int nbOfCells;
	protected Cell[] theCells;
	/**
	*create a new board
	*/
	public Board(int nbOfCells){
		this.nbOfCells = nbOfCells;
		theCells = new Cell[nbOfCells+1];
		initBoard();
	
	}
	/**
	* intitialise the board 
	*/
	protected abstract void initBoard();
	/**
	* get the cell of index 
	*@param index of the cell
	*@return the cell of index
	*/
	public Cell getCell(int index){
            if (nbOfCells<index){
		return this.theCells[nbOfCells - (index-nbOfCells)];}
            else{
                return this.theCells[index];
            }
	}
	/**
	*@return the number of the calls
	*/
	public int NbOfCells(){
		return this.nbOfCells;
		}

    
}
