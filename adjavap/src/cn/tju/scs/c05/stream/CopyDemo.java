package cn.tju.scs.c05.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDemo {
	public static void main(String[] args) throws Exception {
		
		long start = System.currentTimeMillis();
		if (args.length!=2){
			System.out.println("命令执行错误");
			System.exit(1);
		}
		
		//进行文件验证
		File inFile = new File(args[0]);
		if (!inFile.exists()){
			System.out.println("源文件不存在，请确认执行路径！");
			System.exit(1);
		}
		
		File outFile = new File(args[1]);
		if (!outFile.getParentFile().exists()){
			outFile.getParentFile().mkdirs();
		}
		
		InputStream input = new FileInputStream(inFile);
		OutputStream output = new FileOutputStream(outFile);
		
		//实现文件copy
		int temp = 0;
		byte data[] = new byte[1024];
		while ((temp = input.read(data))!=-1){
			output.write(data,0,temp);
		}
		
		input.close();
		output.close();
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		
	}

}
