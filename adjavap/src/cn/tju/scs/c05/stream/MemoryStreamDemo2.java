package cn.tju.scs.c05.stream;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class MemoryStreamDemo2 {

	public static void main(String[] args) throws Exception {
		//1. 分别建立两个file对象
		File fileA = new File("E:" + File.separator + "demo" + File.separator + "infoc.txt");
		File fileB = new File("E:" + File.separator + "demo" + File.separator +"infob.txt");
		
		//2. 建立两个InputStream对象
		InputStream isa = new FileInputStream(fileA);
		InputStream isb = new FileInputStream(fileB);
		
		//3. 建立内存字节流的对象
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		//4. 分别读入isa、isb
		int temp = 0;
		while((temp = isa.read())!=-1){
			output.write(temp);
		}
		
		byte da[] = output.toByteArray();
		System.out.println(new String(da));
		
		System.out.println("-----------------");
		
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
