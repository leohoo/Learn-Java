package strategy;

interface IOperation {
	int operate(int a, int b);
}

class Multiply implements IOperation{

	@Override
	public int operate(int a, int b) {
		return a*b;
	}
	
}

class Addition implements IOperation{

	@Override
	public int operate(int a, int b) {
		return a+b;
	}
	
}

class Operator{
	private IOperation op;
	
	Operator(IOperation operation){
		op = operation;
	}
	
	int operate(int a, int b){
		return op.operate(a, b);
	}
}

public class OperatorSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Operator add = new Operator(new Addition());
		
		System.out.println(add.operate(3, 4));
	}

}
