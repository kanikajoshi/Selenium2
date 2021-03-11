package RevisionDay1;

public class SingletonImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingletonClass ob1 = SingletonClass.get();
		SingletonClass ob2 =SingletonClass.get();
		SingletonClass ob3 =SingletonClass.get();
		SingletonClass ob4 =SingletonClass.get();
		SingletonClass ob5 =SingletonClass.get();
		SingletonClass ob6 =SingletonClass.get();
		SingletonClass ob7 =SingletonClass.get();
		
		
		System.out.println("============================================================");
		System.out.println("this shows that the shared copy is created for single object");
	}

}
