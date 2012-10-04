public class PascalsTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 14;
		int line[][] = new int[n][];
		int maxlen = 0;

		// calculating 
		for (int i = 1; i <= n; i++) {
			line[i - 1] = new int[i + 2]; // ex: line[3-1] => { 0, 1, 2, 1, 0 }
			if (i == 1) {
				line[i - 1][1] = 1;
			} else {
				for (int j = 1; j <= i; j++) {
					line[i - 1][j] = line[i - 2][j - 1] + line[i - 2][j];

					// max length
					if (j == (i + 1) / 2) {
						int len = String.format("%d", line[i - 1][j]).length();
						if (len > maxlen)
							maxlen = len;
					}
				}
			}
		}

		// print the triangle
		for (int i = 1; i <= n; i++) {
			if (i < n) {
				String indent_format = String.format("%%%ds", (n - i)
						* (maxlen + 1) / 2);
				System.out.print(String.format(indent_format, ""));
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(format(maxlen + 1, line[i - 1][j]));
			}

			System.out.println();
		}
	}

	static String format(int length, int n){
		String number = String.format("%d", n);
		int pad = (length - number.length()) / 2;

		String pad_format = String.format("%%%ds", pad);
		String s = number
				+ (pad > 0 ? String.format(pad_format, "") : "");

		String format = String.format("%%%ds", length);
		return String.format(format, s);
	}
}
