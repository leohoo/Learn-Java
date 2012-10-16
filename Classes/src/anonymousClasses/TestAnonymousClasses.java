package anonymousClasses;

import inheritanceAndComposition.Car;

public class TestAnonymousClasses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Car car = new Car();
		
		car = new Car(){
			String msg = "I am an anonymous Car.\nI move very fast.";
			
			@Override
			public void move(){
				System.out.println(msg);
			}
		};
		
		car.move();
		String name = car.getClass().getName();
		System.out.println(name);
	}

}
