/**
 * abstract assert boolean break byte case catch char class const continue
 * default do double else enum extends final finally float for goto if
 * implements import instanceof int interface long native new package private
 * protected pubic return short static strictfp super switch synchronized this
 * throw throws transient try void volatile while
 */
public class Keywords {
	enum Number {
		One, Two, Three
	};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		start: System.out.println("start");

		// goto start;
		// const int a=1;

		Number n;
		n = Number.Two;
		
		if( n instanceof Number){
			System.out.println("n is a Number.");
		}
	}

}
