package cn.tju.scs.c05.stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MemoryStreamDemo {

	public static void main(String[] args) throws Exception {
		String str = "Hello*World!!";
		InputStream input = new ByteArrayInputStream(str.getBytes());
		OutputStream output = new ByteArrayOutputStream();
		
		int temp = 0;
		while((temp = input.read())!=-1){
			System.out.print((char)temp);
			output.write(Character.toUpperCase(temp));
		}
		
		
		System.out.println("");
		System.out.println(output);
		System.out.println(str.toUpperCase());
		

	}

}
