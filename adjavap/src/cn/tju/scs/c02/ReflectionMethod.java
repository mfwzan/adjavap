package cn.tju.scs.c02;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class CarMethod{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class ReflectionMethod {
	public static void main(String[] args) throws Exception {
		String fieldName = "name";
		Class<?> clazz = Class.forName("cn.tju.scs.c02.CarMethod");
		Object obj = clazz.newInstance();
		Method getMethod = clazz.getMethod("get"+initCap(fieldName));
		Method setMethod = clazz.getMethod("set"+ initCap(fieldName), String.class);
		setMethod.invoke(obj, "Toyota");
		System.out.println(getMethod.invoke(obj));
		System.out.println("-----------------");
		Field nameField = clazz.getDeclaredField(fieldName);
		nameField.setAccessible(true);
		nameField.set(obj, "红旗");
		System.out.println(nameField.get(obj));
	}
	
	public static String initCap(String str){
		return str.substring(0,1).toUpperCase() + str.substring(1);
	}

}
