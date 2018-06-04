package cn.tju.scs.c05.stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {
	public static void main(String[] args) throws Exception {
		File file = new File("E:" + File.separator + "demo" + File.separator + "writer.txt");
		if (!file.getParentFile().exists()){
			file.getParentFile().mkdirs();
		}
		
		Writer wrt = new FileWriter(file);
		String str = "Writer up";
		wrt.write(str);
//		wrt.flush();
		
//		wrt.close();
		
	}

}
