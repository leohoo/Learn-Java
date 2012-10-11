package inheritanceAndComposition;

public class TeslaRoadster extends Car implements IElectric, IConvertible {

	public TeslaRoadster(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	@Override
	public void recharge() {
		System.out.println(this + " is charging...");

		for(int i=10; i<=100; i+=10){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("..." + i + "%");
		}
		System.out.println();
		
		System.out.println("Charged.");
	}

}
