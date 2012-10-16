package simpleExamples;

public class SimpleRunnable {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		Runnable r = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Hello from thread "
							+ Thread.currentThread().getName());

					try {
						Thread.sleep((long) (Math.random()*1000));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};

		Thread thread = new Thread(r);
		thread.start();

	}

}
