package test;

import geometry.Hypotenuse;

abstract class Vehicle { public int speed() { return 0; } }
class Car extends Vehicle { public int speed() { return 60; } }
class RaceCar extends Car { public int speed() { return 150; } }

public class Test {
	public static void main(String[] args){
		Hypotenuse hypo = new Hypotenuse();
		
		Object o = hypo.it;
//		int i = hypo.it.base;
		
		test();
	}
	
	static void test(){
		RaceCar racer = new RaceCar();
		Car car = new RaceCar();
		Vehicle vehicle = new RaceCar();
		System.out.println(racer.speed() + ", " + car.speed()
		    + ", "+ vehicle.speed());		
	}
}
