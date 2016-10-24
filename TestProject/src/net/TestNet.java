package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestNet {

	public static void main(String[] args) {
		
		try {
			InetAddress addr = InetAddress.getByName("www.baidu.com");
			String ip = addr.getHostAddress();
			System.out.println(ip);
			System.out.println(addr.getHostName());
			System.out.println(addr.getLocalHost());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
