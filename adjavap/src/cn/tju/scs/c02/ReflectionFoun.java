package cn.tju.scs.c02;

import java.util.Date;

public class ReflectionFoun {

	public static void main(String[] args) throws ClassNotFoundException {
		Date d = new Date();
		Class<?> c = d.getClass();
//		Class<?> clazz = Date.class;
//		Class<?> clazz = Class.forName("java.util.Date");
		
		
		System.out.println(c);

	}

}
