package final_demo;

class Base
{
	final static String FOO = "foo";
	final void foo(){}
}

class Sub extends Base{
	static final String FOO = "bar";
	
//	void foo(){}
}

public class FinalDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Sub s = new Sub();
	//	System.out.println(((Base)s).FOO);
	}

}
