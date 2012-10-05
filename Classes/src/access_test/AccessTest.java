package access_test;

import different_package.ClassB;

public class AccessTest {

	/**
	 * Get the method name for a depth in call stack. <br />
	 * Utility function
	 * @param depth depth in the call stack (0 means current method, 1 means call method, ...)
	 * @return method name
	 */
	public static String getMethodName()
	{
	  final StackTraceElement[] ste = Thread.currentThread().getStackTrace();

	  return ste[2].toString();
	}
	
	static class ClassC extends ClassB{
		void foo(){
			System.out.println(AccessTest.getMethodName());
			super.protectedMethod();
			
			// not visible
//			super.noModifierMethod();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassA a = new ClassA();
		
		a.noModifierMethod();
		a.protectedMethod();

		ClassB b = new ClassB();
		
		b.publicMethod();
		
		// not visible
//		b.noModifierMethod();
//		b.protectedMethod();
		
		ClassC c = new ClassC();
		
		c.foo();
	}

}
