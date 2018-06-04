package cn.tju.scs.c05.stream;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入数据：");
		if (scan.hasNextDouble()){
			System.out.println("输入的数据：" + scan.nextDouble());
		} else {
			System.out.println("输入的不是数据");
		}
		scan.close();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
