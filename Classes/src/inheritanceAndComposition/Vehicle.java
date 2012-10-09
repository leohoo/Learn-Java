package inheritanceAndComposition;

public abstract class Vehicle extends Transport {

	public Vehicle(String name){
		super(name);
	}
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	void move() {
		System.out.println(this + " moves on the ground.");
	}

}
