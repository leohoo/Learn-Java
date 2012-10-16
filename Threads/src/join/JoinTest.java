package join;

import java.util.Vector;

public class JoinTest {
	private Vector<String> threadNames = new Vector<String>();

	public static void main(String[] args) {
		JoinTest test = new JoinTest();
		test.threadTest(10);
		System.out.println(test.threadNames);
	}

	private void threadTest(int numOfThreads) {
		Thread[] threads = new Thread[numOfThreads];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new JoinTest.MyThread();
			threads[i].start();
		}
		
		for (int i = 0; i < threads.length; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException ignore) {
			}
		}
	}

	class MyThread extends Thread {
		public void run() {
			for (int i = 0; i < 1000000; i++) {
				i = i + 0;
			}
			threadNames.add(getName());
		}
	}
}