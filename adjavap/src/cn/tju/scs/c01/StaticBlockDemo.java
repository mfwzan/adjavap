package cn.tju.scs.c01;

public class StaticBlockDemo {
	

	public static void main(String[] args) {
		System.out.println("Main");

	}
	
	static{
		System.out.println("Static Block!");
		System.exit(0);
	}

}
