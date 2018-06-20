package cn.tju.scs.c07.thread;

class Message{
	private String role;
	private String action;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}	
}

class Producer implements Runnable{
	private Message msg;
	public Producer(Message msg){
		this.msg = msg;
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (i%2==0){
				this.msg.setRole("Producer");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.msg.setAction("Produce ");
			}else {
				this.msg.setRole("生产者");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.msg.setAction("生产");
			}
		}
	}
}

class Consumer implements Runnable{
	private Message msg;
	public Consumer(Message msg){
		this.msg = msg;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.msg.getRole()+ "  " + this.msg.getAction());
		}
	}
}

public class ProduceConsumeDemo {

	public static void main(String[] args) {
		Message msg = new Message();
		new Thread(new Producer(msg)).start();
		new Thread(new Consumer(msg)).start();

	}

}
