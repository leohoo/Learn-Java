package super_demo;

class Super{
	public int a;
	protected Super(int a){ this.a = a; }	
}

class Sub extends Super {
	public Sub(int a){ super(a); }
	public Sub() { this(5); }
}

public class SuperDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
