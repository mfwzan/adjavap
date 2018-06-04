package cn.tju.scs.c05.stream;

import java.io.IOException;
import java.io.InputStream;

public class SystemInDemo {

	public static void main(String[] args) throws Exception {
		//第一种：基本输入读取
//		InputStream input = System.in;
//		byte data[] = new byte[1024];
//		System.out.print("请输入数据：");
//		int len = input.read(data);//把数据读进data并返回长度
//		System.out.println("输入数据为：" + new String(data,0,len));
		
		//第二种：改进方法
		InputStream input = System.in;
		StringBuffer buf = new StringBuffer();
		System.out.print("请输入数据：");
		int temp = 0;
		while((temp = input.read())!=-1){
			if (temp == '\n'){
				break;
			}
			buf.append((char)temp);
			
		}
		System.out.println("输入数据为：" + buf);

	}

}
