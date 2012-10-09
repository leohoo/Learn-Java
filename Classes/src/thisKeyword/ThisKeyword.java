package thisKeyword;

public class ThisKeyword {

	int x;
	
	public ThisKeyword(int x){
		this.x = x;
	}
	
	public String toString(){
		return "This is " + x + ".";
	}
	
	void print(){
		print(this);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ThisKeyword t = new ThisKeyword(3);
		t.print();
	}

	static void print(Object t){
		System.out.println(t);
	}
}
