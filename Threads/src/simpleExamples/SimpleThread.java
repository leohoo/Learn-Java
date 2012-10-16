package simpleExamples;

public class SimpleThread extends Thread {

	public void run(){
		System.out.println(getName() + " started.");

		for(int i=0; i<20; i++){
			System.out.println("Hello from thread " + Thread.currentThread().getName());
			
			try {
				Thread.sleep((long) (Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(getName() + " stopped.");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleThread thread = new SimpleThread();
		thread.setName("Hello Thread");

		thread.start();
		
		for(int i=0; i<10; i++){
			System.out.println("こんにちは from thread " + Thread.currentThread().getName());
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Main thread finished.");
	}
}
