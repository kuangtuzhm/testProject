package NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelTest {

	public static void main(String[] args) {
		
		try {
			RandomAccessFile aFile = new RandomAccessFile("E:/work/oss管理后台.txt", "rw");  
			FileChannel inChannel = aFile.getChannel();
			
			ByteBuffer buf = ByteBuffer.allocate(48); 
			
			int bytesRead = inChannel.read(buf);  
			while(bytesRead!=-1)
			{
				//System.out.println("Read " + bytesRead);  
				buf.flip();  
				  
				while(buf.hasRemaining()){  
					System.out.print((char) buf.get());  
				}
				buf.clear();  
				bytesRead = inChannel.read(buf);  
			}
			aFile.close();
			System.out.println("\n结束。。。。。。。。。。。");
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} 
	}

}
