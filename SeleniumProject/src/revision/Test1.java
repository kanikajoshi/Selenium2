package revision;

import selenium.Test3;

public class Test1 {

	 static Test1 ob1 = new Test1();
	 static Test2 ob2 = new Test2();
	 static Test3 ob3 = new Test3();

	public static void main(String[] args) {
	
	x();
	ob1.y();
	
	Test2.alpha();
	ob2.beta();
	
    Test3.testing3();
    ob3.testing4();
    
    
	
  
  
  }
	
	public static void x() {
		
		System.out.println("I am in x method");
	}
	public void y() {
		System.out.println("I m in y");
		
	}
}
