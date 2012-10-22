package varargs;

public class Varargs {

	public static String doit(int x, int y){
		return "int, int";
	}
	
	public static String doit(int... x){
		return "int...";
	}

//	public static String doit(short... s){
//		return "short...";
//	}

	public static String doit(boolean... b){
		return "boolean...";
	}

	public static String doit(char... c){
		return "char...";
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(doit(1,2));
//		System.out.println(doit());
	}

}
