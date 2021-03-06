package aw.paiza.training.C;

import static org.junit.Assert.fail;

import java.io.InputStream;

import org.junit.Test;

import aw.paiza.training.C.C014.C014Logic;

public class C014Test {

	private static C014Logic logic = new C014Logic();

	@Test
	public void test() {
		try {
			String path = "aw/test/C/C014";
			InputStream input = ClassLoader.getSystemResourceAsStream(path);
			System.setIn(input);

			logic.execute(System.in);
			// assertTrue((result == 75));

		} catch (Exception e) {
			e.printStackTrace();
			fail("exception occured");
		}
	}

}
