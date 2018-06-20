package cn.tju.scs.c07.threadintro;

class ThreadExt extends Thread{
	private int Ticket = 10;
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (this.Ticket > 0){
				System.out.println(this.getName() + "卖票 ticket = " + this.Ticket--);
			}			
		}
	}
}

public class ThreadExtDemo {
	public static void main(String[] args) {
		ThreadExt t1 = new ThreadExt();		
		t1.setName("售票处1");
		ThreadExt t2 = new ThreadExt();
		t2.setName("售票处2");
		t1.start();
		t1.start();
		t2.run();
	}
}
