package cn.tju.scs.c03.proxy;

public class ProxyObject implements IProxy {
	private IProxy proxy;
	
	public ProxyObject(IProxy proxy) {
		this.proxy = proxy;
	}
	
	public void prepare(){
		System.out.println("Before buying");
	}
	
	public void after(){
		System.out.println("After buying");
	}

	@Override
	public void performOperations() {
		this.prepare();
		this.proxy.performOperations();
		this.after();

	}

}
