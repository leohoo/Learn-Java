package singleton;

public class SingletonPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		assert(s == s2);

		s = new Singleton();	// this should not compile.
	}

}
