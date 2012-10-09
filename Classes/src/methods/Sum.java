/**
 * This sample code demonstrates 
 *  methods 
 *  argument 
 *  variable-length argument lists
 *  ambiguity
 */
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
		
		System.out.println("---------------------------------------");
		int result = sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("The sum is " + result + ".");
		
		System.out.println(sum(new int[] {1,2,3}));
		
		System.out.println(sum(new int[0]));
		
		// ambiguity
		//sum();
	}

	public static int sum(Function func, int from, int to){	
		int sum = 0;
		
		for(int i=from; i<=to; i++){
			sum += func.f(i);
		}
		
		return sum;
	}
	
	public static int sum(int... n){
		int s = 0;
		for(int i:n){
			s += i;
		}
		return s;
	}
	
	public static int sum(boolean... b){
		int s = 0;
		for(boolean v:b){
			if(v) s++;
		}
		return s;
	}

	public static double sum(double ...d){
		double sum = 0;
		for(double v: d){
			sum += v;
		}
		
		return sum;
	}
}
