package cn.tju.scs.c05.file;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
//		File file = new File("c:/test.txt");
		File file = new File("e:" + File.separator + "demo2"+File.separator+"scs2016.txt");
		if (file.exists()){
			file.delete();
		}else{
			file.createNewFile();
		}
	}

}
