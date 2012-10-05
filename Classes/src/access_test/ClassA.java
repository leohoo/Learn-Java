package access_test;

public class ClassA {
	
	void noModifierMethod(){
		System.out.println(AccessTest.getMethodName());
	}
	
	protected void protectedMethod(){
		System.out.println(AccessTest.getMethodName());
	}
}
