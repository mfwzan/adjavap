package cn.tju.scs.c03.proxy;

public class ProxyDemo {

	public static void main(String[] args) {
		IProxy proxy = new ProxyObject(new ProxyRealObject());
		proxy.performOperations();

	}

}
