package cn.tju.scs.c03.proxy;

public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("从房主处租房");

	}
	
	public void output(){
		try {
			Thread.sleep(100);
			System.out.println("装修");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
