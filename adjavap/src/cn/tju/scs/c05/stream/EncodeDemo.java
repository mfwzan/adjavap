package cn.tju.scs.c05.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class EncodeDemo {

	public static void main(String[] args) throws Exception {
		System.getProperties().list(System.out);
		File file = new File("E:" + File.separator + "demo" + File.separator + "encode.txt");
		OutputStream os = new FileOutputStream(file);
		
		os.write("中国万岁".getBytes("UTF-8"));
		os.close();

	}

}
