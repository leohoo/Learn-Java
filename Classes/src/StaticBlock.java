import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class StaticBlock {

	static String date;
	static{
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		StaticBlock.date = dateFormat.format(date);
	}

	public String toString(){
		return date;
	}
	
	public static void main(String []args) throws InterruptedException{
		System.out.println(new StaticBlock());
		
		Thread.sleep(1000);
		System.out.println(new StaticBlock());
		
		Thread.sleep(1000);
		System.out.println(new StaticBlock());
	}
}
