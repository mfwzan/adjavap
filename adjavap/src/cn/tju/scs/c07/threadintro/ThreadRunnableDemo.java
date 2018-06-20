package cn.tju.scs.c07.threadintro;

class MyThreadRun implements Runnable{
	private String name;
	public MyThreadRun(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println(this.name + "-->" + i);
		}
	}
}

public class ThreadRunnableDemo {

	public static void main(String[] args) {
		MyThreadRun mt1 = new MyThreadRun("线程A");
		MyThreadRun mt2 = new MyThreadRun("线程B");
		MyThreadRun mt3 = new MyThreadRun("线程C");
		
		new Thread(mt1).start();
		new Thread(mt2).start();
		new Thread(mt3).start();

	}

}
