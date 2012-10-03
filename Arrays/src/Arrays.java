public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// declaration of linear arrays
		int[] k;
		float[] yt;
		String[] names;

		int k1[];
		float yt1[];
		String names1[];

		// multi-dim arrays
		int square[][], cube[][][];
		int[][][] cube1, cube2, cube3;

		square = new int[3][3];
		cube = new int[1][][];
		
		// int k[3];
		// float yt[7];
		// String names[100];

		// char string[] = "hello, world!";

		int[][] test = { { 1, 2 }, { 1, 2, 3 } };

		int test2[][] = { { 1, 2 }, { 2, 3 } };
	
		// irregular array
//		test = new int[10][];
//		for(int i=0; i<test.length; i++){
//			test[i] = new int[i];
//		}

		for (int p[] : test) {
			for (int i : p) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
