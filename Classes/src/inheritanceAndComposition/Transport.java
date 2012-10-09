package inheritanceAndComposition;

public abstract class Transport {
	String name;
	
	public Transport(){
		name = this.getClass().getSimpleName();
	}
	
	public Transport(String name){
		this.name = name + "(" + this.getClass().getSimpleName() + ")";
	}
	
	public String toString(){
		return name;
	}
	
	abstract void move();
}
