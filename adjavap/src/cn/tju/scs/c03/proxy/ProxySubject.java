package cn.tju.scs.c03.proxy;

import java.util.Date;

public class ProxySubject implements Subject {
	private Date t1,t2;
	long dateDiff;
	

	private RealSubject realsubject;
//	public ProxySubject(RealSubject realsubject){
//		this.realsubject = realsubject;
//	}
//	
	public void before(){
		System.out.println("租房前的工作");
	}
	
	public void after(){
		System.out.println("租房后的工作");
	}
	@Override
	public void request() {
		if (null == realsubject){
			realsubject = new RealSubject();
		}
		t1 = new Date(System.currentTimeMillis());
		this.before();
		realsubject.request();
		this.after();
		t2 = new Date(System.currentTimeMillis());
		
		dateDiff = t2.getTime() - t1.getTime(); 
		System.out.println(dateDiff + "毫秒完成了租房");

	}
	
	

}
