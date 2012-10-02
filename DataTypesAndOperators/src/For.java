public class For {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// sum up 1-10
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}

		System.out.println("Sum of 1-10 is " + sum);

		// Multiple Initializers and Incrementers
//		for (int i = 1, j = 100; i < 100; i = i + 1, j = j - 1) {
//			System.out.println(i + j);
//		}
	}

}
