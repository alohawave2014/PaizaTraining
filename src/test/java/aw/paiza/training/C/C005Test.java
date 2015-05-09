package aw.paiza.training.C;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import aw.paiza.training.C.C005.C005Logic;

public class C005Test {

	private static C005Logic logic = new C005Logic();

	@Test
	public void test() {
		try {
			String path = "aw/test/C/C005";
			logic.execute(ClassLoader.getSystemResourceAsStream(path));
			assertTrue(true);

		} catch (Exception e) {
			e.printStackTrace();
			fail("exceptin occured");
		}
	}
}
