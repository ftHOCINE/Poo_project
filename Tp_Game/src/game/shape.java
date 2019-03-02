package game ;
import java.util.Random;


public enum shape{ ROCK,PAPER,SCISSOR;


public static shape random(){
	Random rand = new Random();
	int num= rand.nextInt(3);
	return shape.values()[num];
}

public int compare(shape c){
	if ((this==shape.ROCK) && (c==shape.SCISSOR)){
	return 1;}
	else if((this== shape.SCISSOR) && (c==shape.ROCK)){
	return -1;}
	else if((this== shape.ROCK) &&(c==shape.PAPER)){
	return -1;}
	else if((this==shape.PAPER) && (c==shape.ROCK)){
	return 1;}
	else if((this==shape.SCISSOR) && (c==shape.PAPER)){
	return 1;}
	else if((this==shape.PAPER) &&(c==shape.SCISSOR)){
	return -1;}
	else{
	return 0;}
}
}				
