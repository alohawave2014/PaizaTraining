package aw.paiza.training.B;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import aw.paiza.training.B.B020.B020Logic;

public class B020Test {

	private static B020Logic logic = new B020Logic();

	@Test
	public void test() {
		try {
			String path = "B/B020";
			logic.execute(ClassLoader.getSystemResourceAsStream(path));
			assertTrue(true);

		} catch (Exception e) {
			e.printStackTrace();
			fail("exceptin occured");
		}

	}

}
