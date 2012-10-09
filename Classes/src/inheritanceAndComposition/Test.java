package inheritanceAndComposition;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// compile error
//		Transport t = new Transport();
		
		Vehicle v;
			
		v = new Car("Farari");
		v.move();
		
		PassengerBoat b = new PassengerBoat("Mayflower");
		b.move();
		
		Vessle vessle = new Vessle();
		vessle.move();
	}

}
