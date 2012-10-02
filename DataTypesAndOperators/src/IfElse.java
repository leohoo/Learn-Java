public class IfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if (args.length > 0) {
			int i = Integer.parseInt(args[0]);

			if (i > 0)
				System.out.println("The number is positive.");
			else if (i < 0)
				System.out.println("The number is negative.");
			else
				System.out.println("The number is zero.");
		}

		else {
			System.out.println("Usage: java "
					+ IfElse.class.getName() + " <number>");
		}

	}

}
