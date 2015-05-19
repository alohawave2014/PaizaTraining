package aw.paiza.training.A;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import aw.paiza.training.A.A012.A012Logic;

public class A012Test {

	private static A012Logic logic = new A012Logic();

	@Test
	public void test() {
		try {
			String path = "A/A012";
			logic.execute(ClassLoader.getSystemResourceAsStream(path));
			assertTrue(true);

		} catch (Exception e) {
			e.printStackTrace();
			fail("exceptin occured");
		}
	}

}
