package cn.tju.scs.c01;

public class ProxyDemo {

	public static void main(String[] args) {
		IProxy proxy = new ProxyObject(new ProxyRealObject());
		proxy.performOperations();

	}

}
