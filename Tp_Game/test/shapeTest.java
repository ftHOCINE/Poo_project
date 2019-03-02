import game.shape;
import org.junit.*;
import static org.junit.Assert.*;


public class shapeTest {



	@Test
	public void testshape(){
	shape p1= shape.random();
	int cpt=0;
	for(shape v : shape.values()){
	if (p1==v)
	cpt=cpt+1;}
	assertEquals(1,cpt);
	}
	
	
	
	@Test
	public void testComp(){
	shape p1= shape.ROCK;
	shape p2= shape.SCISSOR;
	shape p3= shape.PAPER;
	int i=p1.compare(p2);  
	assertEquals(i,1);
	int e=p1.compare(p3);
	assertEquals(e,-1);
	int r=p3.compare(p2);  
	assertEquals(r,-1);
	int x=p3.compare(p1);
	assertEquals(x,1);
	int y=p2.compare(p1);  
	assertEquals(y,-1);
	int o=p2.compare(p3);
	assertEquals(o,1);	
	}
	
public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(shapeTest.class);
    }

}
