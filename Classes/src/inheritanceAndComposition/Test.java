package inheritanceAndComposition;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// compile error
//		Transport t = new Transport();
		
		Vehicle v;
			
		// compile error
//		v= new Vehicle();
		
		v = new Truck();
		v.move();
		System.out.println();
		
		v = new Car("Farari");
		v.move();
		System.out.println();
		
		PassengerBoat b = new PassengerBoat("Mayflower");
		b.move();
		System.out.println();
		
		Vessle vessle = new Vessle();
		vessle.move();
	}

}
