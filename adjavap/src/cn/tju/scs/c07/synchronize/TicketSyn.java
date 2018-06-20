package cn.tju.scs.c07.synchronize;

class TicketThread implements Runnable{
	private int ticket = 50;
	@Override
	public void run() {
		
//		for (int i = 0; i < 2000; i++) {
//			synchronized (this) {
//				if (this.ticket > 0) {
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName() + "卖票：" + this.ticket--);
//				}
//			}
//			
//		}		
//		
		for (int i = 0; i < 200; i++) {
			try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			synchronized (this) {
				if (this.ticket > 0) {
					
					System.out.println(Thread.currentThread().getName() + "卖票：" + this.ticket--);
				}
				
			}		
		
				
			}
			
	}
}
public class TicketSyn {

	public static void main(String[] args) {
		TicketThread tt = new TicketThread();
		Thread t1 = new Thread(tt,"线程A");
		Thread t2 = new Thread(tt,"线程B");
		Thread t3 = new Thread(tt,"线程C");
		Thread t4 = new Thread(tt,"线程D");
		Thread t5 = new Thread(tt,"线程E");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
