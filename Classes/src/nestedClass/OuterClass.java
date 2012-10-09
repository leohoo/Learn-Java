/**
 * This code demonstrates
 *   nested classes
 *   using the this keyword to indicate OuterClass instance
 */
package nestedClass;
import access_test.AccessTest;


public class OuterClass {

	class InnerClass{
		void f(){
			System.out.println(AccessTest.getMethodName());			
		}
		
		void bar(){
			// call InnerClass's f
			System.out.print("Call f() ==>");
			f();

			// call OuterClass's f
			System.out.print("Call OuterClass.this.f() ==>");
			OuterClass.this.f();
			
			// syntax error
//			OuterClass.f();
		}
	}
	
	static class StaticInnerClass{
		
	}
	
	void f(){
		System.out.println(AccessTest.getMethodName());	
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OuterClass t = new OuterClass();
		
		t.f();
		
		InnerClass a = t.new InnerClass();
		a.bar();
		
		StaticInnerClass s = new StaticInnerClass();
	}

}
