public class DoWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = -1;
		do {
			if (i == -1)
				System.out.print("Hello ");
			else {
				System.out.print(args[i]);
				System.out.print(" ");
			}
			i = i + 1;
		} while (i < args.length);
		System.out.println(); // Finish the line
	}
}
