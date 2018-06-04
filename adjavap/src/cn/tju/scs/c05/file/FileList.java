package cn.tju.scs.c05.file;

import java.io.File;
import java.util.Iterator;

public class FileList {

	public static void main(String[] args) {
		File file = new File("D:/abc");
		
		String[] names = file.list();
		for (String name : names) {
			System.out.println(name);
		}
		
		File[] files = file.listFiles();
		for (File file2 : files) {
			System.out.println(file2.getName());
		}
	}

}
