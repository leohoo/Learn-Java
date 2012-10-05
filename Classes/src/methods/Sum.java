package methods;

public class Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int from = 0, to = 3;
		
		Function f [] = new Function[3];
		f[0] = new Self();
		f[1] = new Double();
		f[2] = new Square();
		
		for(int i=0; i<f.length; i++){
			System.out.print("Sum of "+ f[i].getClass().getSimpleName() + "\t==> ");
			System.out.println(sum(f[i], from, to));
		}
	}

	public static int sum(Function func, int from, int to){
		
		int s = 0;
		
		for(int i=from; i<=to; i++){
			s += func.f(i);
		}
		
		return s;
	}
}
