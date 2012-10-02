public class While {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Hello "); // Say Hello

		int i = 0; // Declare and initialize loop counter

		while (i < args.length) { // Test and Loop
			System.out.print(args[i]);
			System.out.print(" ");
			i = i + 1; // Increment Loop Counter
		}

		System.out.println(); // Finish the line
	}

}
