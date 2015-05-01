package aw.paiza.training.C;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.FileInputStream;

import org.junit.BeforeClass;
import org.junit.Test;

import aw.paiza.training.C.C016.C016Logic;

public class C016Test {

	private static C016Logic logic;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		logic = new C016Logic();
	}

	@Test
	public void test() {
		try {
			String path = "C:\\00_SSD\\Temp\\testcase\\C016.txt";

			System.setIn(new FileInputStream(path));
			logic.execute(System.in);

		} catch (Exception e) {
			e.printStackTrace();
			fail("Not yet implemented");
		}
		assertTrue(true);
	}

}
