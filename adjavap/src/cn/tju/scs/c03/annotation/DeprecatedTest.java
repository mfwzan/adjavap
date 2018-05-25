package cn.tju.scs.c03.annotation;

import java.util.Date;

public class DeprecatedTest {
	@Deprecated
	public void doSomething(){
		System.out.println("Do Something");
	}
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		DeprecatedTest test = new DeprecatedTest();
		test.doSomething();
		
		Date date = new Date();
		System.out.println(date.toLocaleString());
		System.out.println(date.getHours());
	}

}
