package cn.tju.scs.c07.threadintro;

class SleepThread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "  " + i);
		}
		
	}
	
}

public class SleepDemo {

	public static void main(String[] args) {
		SleepThread st = new SleepThread();
		
//		new Thread(st,"线程A").start();
//		new Thread(st,"线程B").start();
//		new Thread(st,"线程C").start();
//		new Thread(st,"线程D").start();
//		new Thread(st,"线程E").start();
		
//		Thread ta = new Thread(st,"线程A");
//		Thread tb = new Thread(st,"线程B");
//		Thread tc = new Thread(st,"线程C");
//		Thread td = new Thread(st,"线程D");
//		
//		ta.setPriority(Thread.MAX_PRIORITY);
////		tb.setPriority(Thread.MIN_PRIORITY);
////		tc.setPriority(Thread.MIN_PRIORITY);
////		td.setPriority(Thread.MIN_PRIORITY);
//		
//		ta.start();
//		tb.start();
//		tc.start();
//		td.start();
		System.out.println(Thread.currentThread().getPriority());

	}

}
