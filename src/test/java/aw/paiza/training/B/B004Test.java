package aw.paiza.training.B;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import aw.paiza.training.B.B004.B004Logic;

public class B004Test {

	private static B004Logic logic = new B004Logic();

	@Test
	public void test() {
		try {
			String path = "B/B004";
			logic.execute(ClassLoader.getSystemResourceAsStream(path));
			assertTrue(true);

		} catch (Exception e) {
			e.printStackTrace();
			fail("exceptin occured");
		}
	}

}
