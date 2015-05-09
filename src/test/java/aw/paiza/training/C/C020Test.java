package aw.paiza.training.C;

import static org.junit.Assert.fail;

import java.io.InputStream;

import org.junit.Test;

import aw.paiza.training.C.C020.C020Logic;

public class C020Test {

	private static C020Logic logic = new C020Logic();

	@Test
	public void test() {
		try {
			String path = "aw/test/C/C020";
			InputStream input = ClassLoader.getSystemResourceAsStream(path);
			System.setIn(input);

			logic.execute(System.in);
			// assertTrue((result == 75));

		} catch (Exception e) {
			e.printStackTrace();
			fail("exceptin occured");
		}
	}

}
