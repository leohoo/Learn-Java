public class TestException {

	static class MyException extends Exception {

	}

	static void f() throws MyException {
		throw new MyException();
	}

	/**
	 * @param args
	 * @throws MyException
	 */
	public static void main(String[] args) throws MyException {
	//	String array[] = new String[10];

		f();

		try {
			System.out.println("begin");

			String s = args[0];
			Integer.parseInt("a");

			System.out.println("end");

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			// System.out.println("ArrayIndexOutOfBoundsException");
		} finally {

		}
	}

}
