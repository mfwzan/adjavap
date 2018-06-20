package cn.tju.scs.c07.thread;

class Message3 {
	private String role;
	private String action;
	
	private boolean flag = true; //表示生产或消费的标记
	//flag = true，允许生产，不允许消费
	//flag = false，允许消费，不允许生产
	
	
	public synchronized void set(String role, String action){
		if (this.flag == false){ //无法生产，等待被消费
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.role = role;
		this.action = action;
		
		this.flag = false;
		this.notify();
	}
	
	public synchronized String get(){
		if (this.flag == true){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		try{
			return this.role + "-" + this.action;
		} finally{ //不管如何都要执行
			this.flag = true;
			this.notify();
			
		}
		
	}
}

class Producer3 implements Runnable{
	private Message3 msg;
	public Producer3(Message3 msg){
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
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.msg.set("制造者", "制造");
			}
		}
	}
}

class Consumer3 implements Runnable{
	private Message3 msg;
	public Consumer3(Message3 msg){
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
			System.out.println(this.msg.get() + i);
		}
	}
}

public class PCFlag {

	public static void main(String[] args) {
		Message3 msg = new Message3();
		new Thread(new Producer3(msg)).start();
		new Thread(new Consumer3(msg)).start();

	}

}
