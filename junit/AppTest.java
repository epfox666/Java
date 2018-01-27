package epfox.calc;

import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
public class AppTest {

	@Test
	public void testAdd() {
//fail("Not yet implemented");
App m = new App() ;
   int ev=10;
   int tv=m.add(5,5); 		
	assertEquals(ev,tv);	
	}
}

