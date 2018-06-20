package cn.tju.scs.c05.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class InputStreamDemo {
	public static void main(String[] args) throws Exception {
		File file = new File("E:" + File.separator + "demo" + 
				File.separator + "test.txt");
		// 1. read(Byte[])
//		if (file.exists()){
//			InputStream is = new FileInputStream(file);
//			byte data[] = new byte[1024];
//			int lenth = is.read(data);
//			String str = new String(data,0,lenth);
//			System.out.println(str + "/end");
//		}
		// 2. read()
		if (file.exists()){
			InputStream is = new FileInputStream(file);
			byte data[] = new byte[1024];
			int foot = 0;
			int temp = 0;
			while((temp = is.read())!=-1) {
				data[foot++] = (byte) temp;
			}
			is.close();
			String str = new String(data,0,foot);
			System.out.println(str);
			
		}
		
	}

}
