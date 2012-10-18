package states;

public class ThreadStatesTest {

	static final String lock = "";
	static Thread main;

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		main = Thread.currentThread();

		Thread t1 = new Thread() {
			public void run() {
				synchronized (lock) {
					try {
						lock.notify();

						// timed waiting
						lock.wait(100);

						// runnable
//						int x = 0;
//						for(int i=0; i<100000000; i++){
//							x = x & 0x1111;
//						}
						long t = System.currentTimeMillis();
						while (System.currentTimeMillis() - t < 100)
							;
						
						// waiting
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		// new
		System.out.print("new => ");
		System.out.println(t1.getState());

		synchronized (lock) {
			t1.start();
			Thread.sleep(10);

			// blocked
			System.out.print("blocked => ");
			System.out.println(t1.getState());
			lock.wait();
		}

		System.out.print("timed waiting => ");
		System.out.println(t1.getState());

		synchronized (lock) {
			lock.notify();
		}
		
		Thread.sleep(10);
		System.out.print("runnable => ");
		System.out.println(t1.getState());

		Thread.sleep(150);
		System.out.print("waiting => ");
		System.out.println(t1.getState());

		synchronized (lock) {
			lock.notify();
		}
		t1.join();

		System.out.print("terminated => ");
		System.out.println(t1.getState());
	}
}
