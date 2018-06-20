package cn.tju.scs.c07.threadintro;

class ThreadRu implements Runnable{
	private int Ticket = 100;
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (this) {
				if (this.Ticket > 0) {
					System.out.println(Thread.currentThread().getName() + "卖票 Ticket= " + this.Ticket--);
				}
			}
				
			
			
		}		
	}
	
}

public class ThreadRuDemo {

	public static void main(String[] args) {
		ThreadRu tr = new ThreadRu();
		Thread t1 = new Thread(tr,"售票处1");
		Thread t2 = new Thread(tr,"售票处2");
		
		t1.start();
		t2.start();
		
	}

}
