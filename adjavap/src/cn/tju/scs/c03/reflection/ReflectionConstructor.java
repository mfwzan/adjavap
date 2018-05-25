package cn.tju.scs.c03.reflection;

import java.lang.reflect.Constructor;

public class ReflectionConstructor {

	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("cn.tju.scs.c01.CarEn");
		Constructor<?> cons[] = clazz.getConstructors();
		Constructor<?> con = clazz.getConstructor(String.class,double.class);
		Object obj = con.newInstance("大众",20.3);
		
		System.out.println(obj);

	}

}
