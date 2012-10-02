public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 9;

		switch (number) {
		case 0:
			System.out.println("The number is zero.");
			break;
		case 1:
			System.out.println("The number is one.");
			break;
		case 2:
			System.out.println("The number is two.");
			break;

		default:
			System.out.println("The number is not one, two, or three.");
			break;
		}

	}

}
