package inheritanceAndComposition;

public class Light {
	String name;
	public Light(String name){
		this.name = name;
	}
	
	public void turnOn() {
		System.out.println(name + " turns on.");
		
	}
}
