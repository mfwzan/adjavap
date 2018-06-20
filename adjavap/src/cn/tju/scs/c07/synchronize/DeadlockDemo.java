package cn.tju.scs.c07.synchronize;

class DlExample{
	private Object obj1 = new Object();
	private Object obj2 = new Object();
	
	public void method1(){
		synchronized (obj1) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (obj2) {
				System.out.println("method1");
			}
		}
	}
	
	public void method2(){
		synchronized (obj2) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (obj1) {
				System.out.println("method2");
			}
		}
		
	}
}

class DLThread1 extends Thread{
	private DlExample example = null;
	public DLThread1(DlExample example){
		super();
		this.example = example;
	}
	
	@Override
	public void run() {
		example.method1();
	}
}

class DLThread2 extends Thread{
	private DlExample example = null;
	public DLThread2(DlExample example){
		super();
		this.example = example;
	}
	
	@Override
	public void run() {
		example.method2();
	}
}

public class DeadlockDemo {

	public static void main(String[] args) {
		DlExample example = new DlExample();
		DLThread1 dlt1 = new DLThread1(example);
		DLThread2 dlt2 = new DLThread2(example);
		
		dlt1.start();
		dlt2.start();

	}

}
