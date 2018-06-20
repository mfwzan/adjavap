package cn.tju.scs.c05.stream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedStreamDemo {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(new File("E:\\demo\\buffers.txt"));
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		int c = 0;
		System.out.println(bis.read());
		System.out.println(bis.read());

	}

}
