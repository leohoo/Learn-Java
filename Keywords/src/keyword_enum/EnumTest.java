package keyword_enum;

enum Title {
	MR("Mr."),
	MRS("Mrs.");
	private Title(String t){
//		title = t;
	}
}

enum Dogs { collie, harrier };

public class EnumTest {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Dogs myDog = Dogs.collie;
		switch (myDog){
		case collie:
			
		}
	}

}
