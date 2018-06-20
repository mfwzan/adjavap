package cn.tju.scs.c05.stream;

import java.io.IOException;
import java.io.OutputStream;

public class SystemDemo {

	public static void main(String[] args) throws Exception {
		try{
			Integer.parseInt("abc");
		} catch(Exception e){
			
			
			System.err.println(e);
//			System.out.println("-----------------");
			System.out.println(e);
		}
		
//		OutputStream out = System.out;
//		out.write("tianjin Unviersity".getBytes());

	}

}
