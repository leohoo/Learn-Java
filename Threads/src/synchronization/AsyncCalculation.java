package synchronization;

public class AsyncCalculation {
	static final int LOOP = 1024;
	static Integer x = 0;

	static void calc() throws InterruptedException {
		x = 0;
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < LOOP; i++)
					x = x + 1;
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < LOOP; i++)
					x = x - 1;
			}
		};

		t1.start();
		t2.start();

		while (t1.isAlive() || t2.isAlive())
			Thread.sleep(10);

		System.out.println("asyncCal: x = " + x);
	}

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 10; i++) {
			calc();
		}
	}

}
