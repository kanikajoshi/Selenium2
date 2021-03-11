package JavaProgams;

	
class A{

	//Object of class A
	static A  ob= new A();

	//Constructor
	private A (){}

	//Method to access the object
	public static A getInstance() {
		System.out.println("Object remains 1");
		return ob;
	}
}


