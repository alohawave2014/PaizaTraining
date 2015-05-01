package aw.paiza.training.C;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.FileInputStream;

import org.junit.BeforeClass;
import org.junit.Test;

import aw.paiza.training.C.C018A.MyLogic;

public class C017Test {

	private static MyLogic logic;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		logic = new MyLogic();
	}

	@Test
	public void execute1() {
		try {
			String path = "C:\\00_SSD\\Temp\\testcase\\C017.txt";

			System.setIn(new FileInputStream(path));
			logic.execute(System.in);

		} catch (Exception e) {
			e.printStackTrace();
			fail("Not yet implemented");
		}
		assertTrue(true);
	}
}
