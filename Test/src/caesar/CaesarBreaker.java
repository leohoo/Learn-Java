package caesar;

import static caesar.CaesarCypher.*;

public class CaesarBreaker {
	final static int CHARNUM = charset.length();

	static String decode(String s, int offset) {
		StringBuilder b = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int p = charset.indexOf(c);
			if (p == -1) {
				b.append(c);
			} else {
				p = (p + offset) % CHARNUM;
				b.append(charset.charAt(p));
			}
		}

		return b.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < CHARNUM; i++) {
			String s = decode(cyphertext, i);
			if (s.contains("JAVA")) {
				System.out.println(s);
				return;
			}
		}

		System.out.println("Failed to decode the text.");
	}
}
