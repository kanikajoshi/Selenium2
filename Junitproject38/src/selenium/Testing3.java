package selenium;
//assertion usage and error collector 


import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class Testing3 {
	
	@Rule
	public ErrorCollector errCol  = new ErrorCollector();
	
	@Test
	public void test6() {
	System.out.println("I Am in  Assert");
	String emsg ="abc";
	String amsg = "abc1";
	
	Assert.assertEquals(emsg, amsg);
	System.out.println("after first Assertion");
	
	Assert.assertTrue("verify if 2>3", 2 > 3);
	System.out.println("After 2nd assertion");
}
	
	
	
	
	@Test
	public void test7() {
	System.out.println("I Am in Assert");
	String emsg ="abc";
	String amsg = "abc1";
	try {
	Assert.assertEquals(emsg, amsg);
	}catch(Throwable t) {
	System.out.println("I am in first catch");
	errCol.addError(t);
	
	}
	System.out.println("after second Assertion");
	try {
	Assert.assertTrue("verify if 2>3", 2 > 3);
	}catch(Throwable t) {
	System.out.println("I am in second catch");
	errCol.addError(t);
	
	}
	System.out.println("after first Assertion");
	}
}
