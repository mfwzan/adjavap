package cn.tju.scs.c01;

public class ProxyRealObject implements IProxy {

	@Override
	public void performOperations() {
		System.out.println("This is a real object");
	}

}
