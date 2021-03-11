package test;

import org.openqa.selenium.firefox.FirefoxDriver;

import selenium.Test3;

public class Test1 {
	
	//ClassName objName = new ClassName();
	static Test1 t1 = new Test1();
	static Test2 t2 = new Test2();
	static Test3 t3 = new Test3();

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		
		System.out.println("Hello main");
		printMe();
		t1.scanMe();
		jaya();
		t1.abc();
		Test2.testing1();
		t2.testing2();
		t3.testing4();
		Test3.testing3();
	}
	
	public static void printMe() {
		System.out.println("print me");
	}
	
	public void scanMe() {
		System.out.println("scan Me");
	}
	
	public static void jaya() {
		System.out.println("I am in test1");
	}
	
	public void abc() {
		System.out.println("I am in test2");
	}

}
