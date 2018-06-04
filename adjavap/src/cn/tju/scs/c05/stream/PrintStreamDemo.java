package cn.tju.scs.c05.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

class PrintUtil{
	private OutputStream output;
	
	public void print(int x){
		this.print(String.valueOf(x));
	}
	public void print(String x){
		try {
			this.output.write(x.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class PrintStreamDemo {

	public static void main(String[] args) throws Exception {
		PrintStream ps = new PrintStream(new FileOutputStream(new File("e:" + File.separator + "demo"+
					File.separator+"printstream.txt")));
		ps.print("天津大学");
		ps.println("Tianjin University");
		ps.println(1+1);
		ps.println(1.1 + 1.1);
		ps.close();
		

	}

}
