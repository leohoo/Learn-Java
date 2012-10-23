package interfaceDemo;

interface InterfaceA{
	void a();
}

interface InterfaceB{
	int B = 100;
	void b();
}

interface InterfaceC extends InterfaceA, InterfaceB{
	
}

public class InterfaceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object o = new InterfaceC(){

			@Override
			public void a() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void b() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}

}
