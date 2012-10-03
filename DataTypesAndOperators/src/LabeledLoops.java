public class LabeledLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 4; j++) {
				if (j == 2)
					break;
				System.out.println(i + ", " + j);
			}
		}

		iloop: for (int i = 1; i < 3; i++) {
			for (int j = 1; j < 4; j++) {
				if (j == 2)
					break iloop;
				System.out.println(i + ", " + j);
			}
		}
	}

}
