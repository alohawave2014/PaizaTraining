package aw.paiza.training.C;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.InputStream;

import org.junit.BeforeClass;
import org.junit.Test;

import aw.paiza.training.C.C015.C015Logic;

public class C015Test {

	private static C015Logic logic;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		logic = new C015Logic();
	}

	@Test
	public void test() {
		try {
			String path = "aw/test/C/C015";
			InputStream input = ClassLoader.getSystemResourceAsStream(path);
			System.setIn(input);

			int result = logic.execute(System.in);
			assertTrue((result == 75));

		} catch (Exception e) {
			e.printStackTrace();
			fail("Not yet implemented");
		}
		assertTrue(true);
	}
}
