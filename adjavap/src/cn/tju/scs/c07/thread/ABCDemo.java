package cn.tju.scs.c07.thread;

class PrintChar implements Runnable{
	private String name;
	public PrintChar(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.print(this.name);
	}
}

public class ABCDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread t1 = new Thread(new PrintChar("A"));
			t1.start();
			
			try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Thread t2 = new Thread(new PrintChar("B"));
			t2.start();
			try {
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Thread t3 = new Thread(new PrintChar("C"));
			t3.start();
			try {
				t3.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
