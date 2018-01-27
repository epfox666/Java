package epfox.calc;

import static org.junit.Assert.*;

import org.junit.Test;

import epfox.calc.*;


public class AppTest2 {

	@Test
	public void testSort1() {
		//fail("Not yet implemented");
		App2 m=new App2();
		int ev=0;
		int tv=m.Sort(0, 0);
		assertEquals(ev,tv);
	}
	@Test
    public void testSort2(){
    	App2 m=new App2();
    	int ev=2;
    	int tv=m.Sort(1, 0);
    	assertEquals(ev,tv);
    }
	@Test
	public void testSort3(){
		App2 m=new App2();
		int ev=10;
		int tv=m.Sort(1, 1);
		assertEquals(ev,tv);
	}
	@Test
    public void testSort4(){
		App2 m=new App2();
    	
    	int ev=20;
    	int tv=m.Sort(1,2);
    	assertEquals(ev,tv);
    }	
		
}
