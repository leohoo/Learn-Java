/**
 * This sample code demonstrates
 *   garbage collection
 *   finalize()
 *   static variable
 */
package gc;

public class Finalize {
	static class FDemo{
		static int fcount = 0;
		int x;
		int mem[] = new int[1024*1024];
		
		FDemo(int i){
			x = i;
		}
		
		protected void finalize(){
			String msg = String.format("%3d: Finalizing %d", fcount++, x);
			System.out.println(msg);
		}
		
		void generator(int i){
			FDemo o = new FDemo(i);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FDemo ob = new FDemo(0);
		for(int count = 1; count<100; count++){
			ob.generator(count);
		}
		
		System.gc();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
