package vector;

import java.io.File;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {

		Test t = new Test();
		int i=2,j=6;
		
		System.out.println("i="+i+",j="+j);
		t.swap(i,j);
		System.out.println("i="+i+",j="+j);
		
	}

	
	public void swap(int a,int b)
	{
		a = a+b;
		b = a-b;
		a = a-b;
	}
}
