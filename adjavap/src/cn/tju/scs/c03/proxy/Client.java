package cn.tju.scs.c03.proxy;

public class Client {

	public static void main(String[] args) {
		Subject subject = new ProxySubject();
		
		subject.request();

	}

}
