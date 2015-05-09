package aw.paiza.training.C;

import static org.junit.Assert.fail;

import java.io.InputStream;

import org.junit.Test;

import aw.paiza.training.C.C013.C013Logic;

public class C013Test {

	private static C013Logic logic = new C013Logic();

	@Test
	public void test() {
		try {
			String path = "aw/test/C/C013";
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
