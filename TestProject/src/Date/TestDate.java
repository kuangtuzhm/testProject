package Date;

import java.util.Date;

public class TestDate {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);
		
		int t = date.toString().indexOf("C");
		System.out.println(date.toString().substring(11,t));
		
	}

}
