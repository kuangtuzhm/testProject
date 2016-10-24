package String;

import java.io.UnsupportedEncodingException;

public class TestString2 {

	public static void main(String[] args) {
		
		
			String s ="AbcD23A412FI34";
			byte [] b = s.getBytes();
			int count = 0;
			for(int i=0;i<b.length;i++)
			{
				System.out.println((char)b[i]);
				if(b[i]>='0' && b[i]<='9')
				{
					count++;
				}	
			}
			System.out.println(count);
			
			
	
	}

}
