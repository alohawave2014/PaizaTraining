package aw.paiza.training.B;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import aw.paiza.training.B.B017.B017Logic;

public class B017Test {

	private static B017Logic logic = new B017Logic();

	// @Test
	public void test() {
		try {
			String path = "B/B017";
			logic.execute(ClassLoader.getSystemResourceAsStream(path));
			assertTrue(true);

		} catch (Exception e) {
			e.printStackTrace();
			fail("exceptin occured");
		}

	}

	@Test
	public void testSample1() {
		logic.sample2("A***");
		assertTrue(true);
	}

}
