package cn.tju.scs.c03.proxy;

public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("从房主处租房");

	}

}
