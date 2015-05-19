package aw.paiza.training.B;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import aw.paiza.training.B.B016.B016Logic;

public class B016Test {

	private static B016Logic logic = new B016Logic();

	@Test
	public void test() {
		try {
			String path = "B/B016";
			logic.execute(ClassLoader.getSystemResourceAsStream(path));
			assertTrue(true);

		} catch (Exception e) {
			e.printStackTrace();
			fail("exceptin occured");
		}

	}

}
