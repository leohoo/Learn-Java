public class CountBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if (args.length > 0) {
			for (String s : args) {
				System.out.print(String.format("%10s==>\t", s));

				try {
					int i = Integer.parseInt(s);
					System.out.print(String.format("%32s", Integer.toBinaryString(i)).replace(' ',  '0') + "\t");

					int c = 0;
					do {
						if ((i & 1) == 1)
							c++;
						i >>>= 1;
					} while (i != 0);

					System.out.println(String.format("%2d bit(s)", c));

				} catch (NumberFormatException e) {
					System.out.println("Not a number.");
				}
			}
		}
	}

}
