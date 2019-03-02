
package goosegame;

public class GameBoard extends Board{

    public GameBoard(int nbOfCells) {
        super(nbOfCells);
    }

    @Override
    protected void initBoard() {
theCells = new Cell[nbOfCells+1];
       theCells[0] = new StartCell();
       for(int i = 1; i<nbOfCells+1 ;i++){
           theCells[i]= new BasicCell(i);
       }
       //Oie
       theCells[9]= new GooseCell(9);
       theCells[18]= new GooseCell(18);
       theCells[27]= new GooseCell(27);
       theCells[36]= new GooseCell(36);
       theCells[45]= new GooseCell(45);
       theCells[54]= new GooseCell(54);
       
       
       //Piege
       theCells[31]= new TrapCell(31);
       theCells[52]= new TrapCell(52);
       
       //Attente
       theCells[19]= new WaitingCell(19,2);
       
       //Teleport
       theCells[6]= new TeleportCell(6,12);
       theCells[42]= new TeleportCell(42,30);
       theCells[58]= new TeleportCell(58,1);
    }
    
    
    
}
