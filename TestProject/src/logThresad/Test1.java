package logThresad;

import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		
		Date start = new Date();
		System.out.println("=========Start");
		
		for(int i=0;i<3;i++)
		{
			Thread t = new Thread(new LogThread());
			t.start();
		}
		
		Date end = new Date();
		System.out.println("测试结束=====测试耗时："+(end.getTime()-start.getTime())+"毫秒");
		
	}

}
