package states;

public class ThreadStatesTest {

	static final String lock = "";

	static class SleepThread extends Thread{
		long time;
		SleepThread(long ms){
			time = ms;
			start();
		}
		
		public void run(){
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread() {
			public void run() {
				synchronized (lock) {
					try {
						// timed waiting
						Thread.sleep(150);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					// runnable
					for(int i=0; i<1000000; i++){
						System.out.print("");
					}
					
					Thread t = new SleepThread(100);
					try {
						// waiting
						t.join();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
		};

		// new
		System.out.println(t1.getState());

		synchronized(lock){
			t1.start();
			Thread.sleep(100);
			
			// blocked
			System.out.println(t1.getState());
		}
		
		Thread.sleep(100);
		System.out.println(t1.getState());

		Thread.sleep(100);
		System.out.println(t1.getState());

		Thread.sleep(100);
		System.out.println(t1.getState());
		
		t1.join();
		System.out.println(t1.getState());
	}
}
