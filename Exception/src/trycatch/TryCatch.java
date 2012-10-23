package trycatch;

class A{
	void process() throws Exception {
		throw new Exception();
	}
}

class B extends A{
	void process() {
		System.out.println("B.process");
	}
}

public class TryCatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A b = new B();
//		b.process();

		try{
			args = null;
			
			b.process();
		}
		catch(Exception e){
			
		}
//		catch(NullPointerException n){
//			
//		}
	}

}
