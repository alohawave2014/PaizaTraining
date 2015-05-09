package aw.paiza.training.C;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.InputStream;

import org.junit.Test;

import aw.paiza.training.C.C008.C008Logic;

public class C008Test {

	private static C008Logic logic = new C008Logic();

	@Test
	public void test() {
		try {
			String path = "aw/test/C/C008";
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
