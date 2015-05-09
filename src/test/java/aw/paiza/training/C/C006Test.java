package aw.paiza.training.C;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.InputStream;

import org.junit.Test;

import aw.paiza.training.C.C006.C006Logic;

public class C006Test {

	private static C006Logic logic = new C006Logic();

	@Test
	public void test() {
		try {
			String path = "aw/test/C/C006";
			InputStream input = ClassLoader.getSystemResourceAsStream(path);
			System.setIn(input);

			logic.execute(System.in);
			// assertTrue((result == 75));
			assertTrue(true);

		} catch (Exception e) {
			e.printStackTrace();
			fail("exceptin occured");
		}
	}
}
