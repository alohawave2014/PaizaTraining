package aw.paiza.training.C;

import static org.junit.Assert.fail;

import java.io.InputStream;

import org.junit.Test;

import aw.paiza.training.C.C010.C010Logic;

public class C010Test {

	private static C010Logic logic = new C010Logic();

	@Test
	public void test() {
		try {
			String path = "aw/test/C/C010";
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
