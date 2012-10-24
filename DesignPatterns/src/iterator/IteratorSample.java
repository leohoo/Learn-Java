package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class MyIterator implements Iterator<Integer>{

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
}

public class IteratorSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Iterator<Integer> it = list.iterator();
		System.out.println(it.getClass().getName());
		
		for(; it.hasNext(); ){
			System.out.println(it.next());
		}
	}

}
