package synchronization;

public class SyncMethods {
	static final int COL = 60;	
	static final int ROW = 10;

	 /*synchronized*/ static void syncMethod1() {
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++)
				System.out.print("■");
			System.out.println();
		}

	}

	/*synchronized*/ static void syncMethod2() {
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++)
				System.out.print("□");
			System.out.println();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				syncMethod1();
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				syncMethod2();
			}
		};

		t1.start();
		t2.start();
	}

}
