package RevisionDay1;

public class SingletonClass {
	
	//object is declared static
	static SingletonClass ob = new SingletonClass();
	static int count=0;
	
	private SingletonClass() {}
	
	
	public static SingletonClass get() {
		count=count+1;
		System.out.println("this is shared object which is shared "+(count)+" times");
		return ob;
	}

}
