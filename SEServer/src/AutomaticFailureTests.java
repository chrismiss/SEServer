import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AutomaticFailureTests {

	@Test
	void test() {
		//fail("This test is supposed to fail");
		assertTrue("This test should also pass", true);
	}
	
	@Test
	void test1() {
		assertTrue("This test is supposed to pass", true);
	}

}
