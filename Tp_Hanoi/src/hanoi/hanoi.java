package hanoi;
import hanoi.util.*;
public class hanoi{
	private Tower[] theTowers;
	private int capacity;
	/**
	 * new tours of hanoi with capacity of discs
	 * @param capacity of towers also nb of discs used 
	 */
	public hanoi(int capacity){
		this.capacity=capacity;
		this.theTowers= new Tower[3];
		for(int i=0;i<3;i++)
		this.theTowers[i]=new Tower(capacity);
		for(int size=capacity;size>0;size--)
		this.theTowers[0].push(new Disc(size));
	}
	/**
	 * get the tower of the indice  i
	 * @param i indice of tower
	 * @return tower of indice i 
	 */ 
	public Tower getTower(int i){
		return this.theTowers[i];
	}
	/**
	 * move a disc from a tower of indice s to a tower of indice d
	 * @param  s: start tower 
	 * @param d : end tower 
	 */ 
	public void moveOneDisc(int s ,int d){
		try{
			Disc dis=this.getTower(s).pop();
			this.getTower(d).push(dis);
		}
		catch (IllegalStateException e){
			System.out.println("you can't push this disc !!!");
		}		
	}
	/**
	 * resolve the game giving all the movements to do to win
	 * @param nb :numbers of discs  
	 * @param s: start tower 
	 * @param a:auxiliaire tower 
	 * @param d : end tower  
	 */ 		 
	public void moveNbDiscs(int nb ,int s,int a, int d){
		if (nb==1){
			System.out.println( s +" to "+ d );
		}else{
			moveNbDiscs(nb-1,s,d,a);
			moveNbDiscs(1,s,a,d);
			moveNbDiscs(nb-1,a,s,d);	
		}
	}
	/**
	 * return a char repeated times times 
	 * @return a char repeated times times as a string
	 * @param str :string to repeat 
	 * @param times : number of times to repeat the string
	 */ 
	public static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }
    /**
     * drow a representation of  the hanoi
     */  
	public void display(){
		for (int i=0; i<3 ; i++){
			Tower t=this.getTower(i);
			System.out.println("***** T O W E R "+i+"*****");  
			if (t.getNbDisc()!=0){
			Disc[] tab = t.getTheDiscs();
			int n = t.getNbDisc();
			if  (n < capacity){
				for (int p=0;p<capacity-n ;p++)
				System.out.println(hanoi.repeat(" ",this.capacity)+"|");
			}	
			for (int j=n-1 ; 0<=j ; j--){
			System.out.println(hanoi.repeat(" ",this.capacity-tab[j].getSize())+hanoi.repeat("-",tab[j].getSize())+"|"+hanoi.repeat("-",tab[j].getSize()));
		}
	}
	else{
		for (int k=0; k<capacity ; k++)
			System.out.println(hanoi.repeat(" ",this.capacity)+"|");
			 
	}
}
		}
	/**
	 *  string representation of the hanoi
	 * @return a reprisentation of this hanoi
	 */ 
	public String toString(){
		return "this hanoi capacity is "+this.capacity ;
}
}	
	
