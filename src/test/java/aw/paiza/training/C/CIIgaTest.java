package aw.paiza.training.C;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import aw.paiza.training.C.CIIga.CIIgaLogic;

public class CIIgaTest {

	private static CIIgaLogic logic = new CIIgaLogic();

	@Test
	public void test() {
		try {
			String path = "aw/test/C/CIIga";
			logic.execute(ClassLoader.getSystemResourceAsStream(path));
			assertTrue(true);

		} catch (Exception e) {
			e.printStackTrace();
			fail("exceptin occured");
		}

	}

}
