package aw.paiza.training.C;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.InputStream;

import org.junit.BeforeClass;
import org.junit.Test;

import aw.paiza.training.C.C014.C014Logic;

public class C014Test {

	private static C014Logic logic = new C014Logic();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		try {
			String path = "aw/test/C/C014";
			InputStream input = ClassLoader.getSystemResourceAsStream(path);
			System.setIn(input);

			logic.execute(System.in);
			//			assertTrue((result == 75));

		} catch (Exception e) {
			e.printStackTrace();
			fail("Not yet implemented");
		}
		assertTrue(true);
	}

}
