package cn.tju.scs.c03.reflection;

import java.util.Date;

public class ReflectionFoun {

	public static void main(String[] args) throws ClassNotFoundException {
//		Date date = new Date();
//		Class<?> clazz = date.getClass();
//		Class<?> clazz = Date.class;
		Class<?> clazz = Class.forName("java.util.Date");
		System.out.println(clazz);

	}

}
