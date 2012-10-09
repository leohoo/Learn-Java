package methods;

public class Recursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(factorial(5));
	}

	static int factorial(int x)
	{
		return x<=1? 1 : x * factorial(x-1);
	}
}
