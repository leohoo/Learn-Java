package different_package;

import access_test.AccessTest;

public class ClassB {

	void noModifierMethod(){
		System.out.println(AccessTest.getMethodName());
	}
	
	protected void protectedMethod(){
		System.out.println(AccessTest.getMethodName());
	}
	
	public void publicMethod(){
		System.out.println(AccessTest.getMethodName());
	}
}
