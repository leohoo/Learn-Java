package staticBlock;

public class StaticBlock {

	static final int[] array;
	static {
		array = new int[]{1,2};
		array[0] = 3;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(array[0]);
	}

}
