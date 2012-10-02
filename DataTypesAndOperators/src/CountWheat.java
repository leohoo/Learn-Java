public class CountWheat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int total = 0;

		for (int square = 1, grains = 1; square <= 64; square++) {
			grains *= 2;
			if (grains <= 0) {
				System.out.println("Error: Overflow");
				break;
			}
			total += grains;
			System.out.print(total + "\t\t  ");
			if (square % 4 == 0)
				System.out.println();
		}
		System.out.println("All done!");
	}

}
