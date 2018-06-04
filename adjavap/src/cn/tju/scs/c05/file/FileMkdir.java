package cn.tju.scs.c05.file;

import java.io.File;

public class FileMkdir {
	public static void main(String[] args) {
		File file = new File("D:/abc/def3");
		System.out.println(file.mkdir());
		System.out.println(file.mkdirs());
		
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
		
	}

}
