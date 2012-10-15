package performanceTest;
public class Test2 {
	int value;

	static final int LOOP = 1;

	public int getValue() {
		return value;
	}

	public void reset() {
		value = 0;
	}

	// Calculates without exception
	public void method1(int i) {
		value = ((value + i) / i) << 1;
		// Will never be true
		if ((i & 0xFFFFFFF) == 1000000000) {
			System.out.println("You'll never see this!");
		}
	}

	public static void main(String[] args) {
		Test t = null;

		t = new Test();

		for (int i = 0; i < 5; i++) {
			testWithTryCatch(t);
			testWithoutTryCatch(t);
		}
	}

	private static void testWithoutTryCatch(Test t) {
		t.reset();
		long l = System.currentTimeMillis();
		for (int j = 0; j < LOOP; j++)
			for (int i = 1; i <= 100000000; i++)
				t.method1(i);

		l = System.currentTimeMillis() - l;
		System.out.println("without try/catch method1 took " + l
				+ " ms, result was " + t.getValue());
	}

	private static void testWithTryCatch(Test t) {
		try {
			t.reset();

			long l = System.currentTimeMillis();
			for (int j = 0; j < LOOP; j++)
				for (int i = 1; i <= 100000000; i++)
					// try {
					t.method1(i);
			// } catch (Exception ignored) {
			// }

			l = System.currentTimeMillis() - l;
			System.out.println("with try/catch method1 took " + l
					+ " ms, result was " + t.getValue());
		} catch (Exception e) {
		}
	}
}