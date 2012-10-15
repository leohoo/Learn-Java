package nestedClass;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		OuterClass.InnerClass i = new OuterClass.Inner();
		OuterClass.InnerClass i = new OuterClass().new InnerClass();
		
		OuterClass.StaticInnerClass s = new OuterClass.StaticInnerClass();
	}

}
