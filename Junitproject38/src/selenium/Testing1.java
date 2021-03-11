package selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before ");
		System.out.println("Login");
	}
	
	

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
		System.out.println("logout");
	}

	@Test
	public void test() {
		System.out.println("Test");

}
}