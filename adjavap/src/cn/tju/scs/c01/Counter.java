package cn.tju.scs.c01;

public class Counter {
	static int count = 0;
	
	public Counter(){
		count++;
		System.out.println("这是第" + count + "个实例");
	}

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();

	}

}
