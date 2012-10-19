package join;

import java.util.Vector;

public class JoinTest2 {
	private Vector<String> threadNames = new Vector<String>();

	public static void main(String[] args) {
		JoinTest2 test = new JoinTest2();
		test.threadTest(10);
		System.out.println(test.threadNames);
	}

	private void threadTest(int numOfThreads) {
		Thread[] threads = new Thread[numOfThreads];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new JoinTest2.MyThread();
			threads[i].start();
		}
		
//		for (int i = 0; i < threads.length-2; i++) {
//			try {
//				threads[i].join();
//			} catch (InterruptedException ignore) {
//			}
//		}
		try {
			threads[0].join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	class MyThread extends Thread {
		public void run() {
			for (int i = 0; i < 10000000; i++) {
				i = i + 0;
			}
			threadNames.add(getName());
		}
	}
}