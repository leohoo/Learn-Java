package inheritanceAndComposition;

public class Vessle extends Transport {

	public Vessle(String name) {
		super(name);
	}

	public Vessle() {
	}

	@Override
	void move() {
		System.out.println(this + " moves on the water.");
	}

}
