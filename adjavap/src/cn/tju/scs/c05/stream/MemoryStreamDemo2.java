package cn.tju.scs.c05.stream;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class MemoryStreamDemo2 {

	public static void main(String[] args) throws Exception {
		File fileA = new File("E:" + File.separator + "demo" + File.separator + "infoc.txt");
		File fileB = new File("E:" + File.separator + "demo" + File.separator +"infob.txt");
		
		InputStream isa = new FileInputStream(fileA);
		InputStream isb = new FileInputStream(fileB);
		
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int temp = 0;
		
		while((temp = isa.read())!=-1){
			output.write(temp);
		}
		
		byte da[] = output.toByteArray();
		System.out.println(new String(da));
		
	
		
		while((temp = isb.read())!=-1){
			output.write(temp);
		}
		byte data[] = output.toByteArray();
		String result = new String(data);
		
		output.close();
		isa.close();
		isb.close();
		
		System.out.println(result);
		

	}

}
