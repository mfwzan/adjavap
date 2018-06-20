package cn.tju.scs.c07.thread;

public class YieldDemo {
	public static void main(String[] args) {
		YieldThread t1 = new YieldThread("小明");
		YieldThread t2 = new YieldThread("小东");
		t1.start();
		t2.start();
		

	}

}

class YieldThread extends Thread{
	private String s;
	public YieldThread(String s){
		this.s = s;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			
			System.out.println(s + "-" + i);
			if (i % 10 == 0) {
				Thread.yield();
			}
			
		}
	}
}
