package cn.tju.scs.c07.threadintro;

class MyThread extends Thread{
	private String name;
	public MyThread(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println(this.name + "-->" + i);
		}
	}
}

public class ThreadIntroDemo {

	public static void main(String[] args) {
		MyThread mt1 = new MyThread("线程A");
		MyThread mt2 = new MyThread("线程B");
		MyThread mt3 = new MyThread("线程C");
		
		mt1.start();
//		mt1.start();
		mt2.run();
		mt3.run();

	}

}
