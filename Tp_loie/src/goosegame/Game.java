package goosegame;

import java.util.*;



public class Game {
    protected List<Player> thePlayers ;
    protected Board board;
   public Game(Board board){
       this.thePlayers = new ArrayList<>();
       this.board=board;
       
   }
   public void addPlayer(Player p){
       this.thePlayers.add(p);
   
   }
   
    
   public void play(){
       
   }
        /** plays one round
        * @param p the player who is playing
        *
        */
    public void playOnePlayer(Player p){

         Cell c = p.getCell();
         if (c.canBeLeft()){
            int n = p.twoDiceThrow();
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*") ;
            System.out.println(p.toString()+" lance les dés ") ;
            System.out.println("il obtient : " + n );
            Cell c1 = this.board.getCell(c.getIndex()+ n) ;
            c1 = this.board.getCell(c1.handleMove(c1.getIndex())) ;
            for( Player p1 : this.thePlayers){
               if(p1.getCell() == c1 ){
                  p1.setCell(c);
                  break ;
               }
            }
            System.out.println("il se trouve maintenant à la case " + c1.getIndex() + c1.toString()) ;
            p.setCell(c1);
        }
         else{
             System.out.println(p.toString()+" ne peut pas jouer " + c.toString()) ;
         }
    }

        /** Plays an entire game 
       */
    public void playAllPlayers(){
         boolean end = false;
         while(!end){
           for( Player p : this.thePlayers){
               this.playOnePlayer(p);
               if (p.getCell().getIndex()==this.board.NbOfCells()){
                 end = true ;
                 System.out.println(p.toString()+ " est le gagnant ") ;
                 break;
                 }
               }
         }
         
       }
}
