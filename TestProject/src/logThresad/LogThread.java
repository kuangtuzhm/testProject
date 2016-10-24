package logThresad;

import java.util.Date;

public class LogThread implements Runnable {

	@Override
	public void run() {
		
		Date start = new Date();
		System.out.println("=========Start");
		
		int sum = 0;
		for(int i=0;i<1000;i++)
		{
			sum += i;
		}
		System.out.println("sum="+sum);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Date end = new Date();
		System.out.println("线程耗时："+(end.getTime()-start.getTime())+"毫秒");
	}

}
