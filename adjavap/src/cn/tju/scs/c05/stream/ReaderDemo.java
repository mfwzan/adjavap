package cn.tju.scs.c05.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReaderDemo {
	public static void main(String[] args) throws Exception {
		File file = new File("E:" + File.separator + "demo" + 
				File.separator + "writer.txt");
		if (file.exists()){
			Reader in = new FileReader(file);
			char data[] = new char[1024];
			int lenth = in.read(data);
			in.close();
			String str = new String(data, 0, lenth );
			System.out.println(str + "END");
		}
	}

}
