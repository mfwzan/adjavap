package cn.tju.scs.c07.thread;

class Message2 {
	private String role;
	private String action;
	
	
	public synchronized void set(String role, String action){
		this.role = role;
		this.action = action;
	}
	
	public synchronized String get(){
		return this.role + "-" + this.action;
	}
}

class Producer2 implements Runnable{
	private Message2 msg;
	public Producer2(Message2 msg){
		this.msg = msg;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (i%2==0){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.msg.set("Producer", "Produce");
			}else {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.msg.set("制造者", "制造");
			}
		}
	}
}

class Consumer2 implements Runnable{
	private Message2 msg;
	public Consumer2(Message2 msg){
		this.msg = msg;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.msg.get());
		}
	}
}

public class PCSyncDemo {

	public static void main(String[] args) {
		Message2 msg = new Message2();
		new Thread(new Producer2(msg)).start();
		new Thread(new Consumer2(msg)).start();

	}

}
