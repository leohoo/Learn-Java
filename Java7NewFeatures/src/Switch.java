
public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s = "One";
		
		int x = 0;
		switch(s){
		case "One":
			x = 1;
			break;
			
		case "Two":
			x = 2;
			break;
			
		case "Three":
			x = 3;
			break;
		}
		
		System.out.println(x);
	}

}
