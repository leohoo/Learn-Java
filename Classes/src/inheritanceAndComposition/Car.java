package inheritanceAndComposition;

public class Car extends Vehicle {
	protected Chassis chassis;
	protected Body body;
	protected SteeringWheel handle;
	protected Seat [] seats;
	protected Light frontLight, backLight;
	protected Engine engine;
	
	public Car(String name){
		super(name);
		
		chassis = new Chassis();
		body = new Body();
		seats = new Seat[6];
		frontLight = new Light();
		backLight = new Light();
		engine = new Engine();
		handle = new SteeringWheel();
	}
	
	@Override
	void move(){
		engine.start();
		
		System.out.println(this + " runs on the highway.");
	}
}
