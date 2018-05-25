package cn.tju.scs.c03.reflection;

import java.lang.reflect.Method;

public class InvokeCalc {

	public static void main(String[] args) throws Exception{
		Class<?> clazz = Class.forName("cn.tju.scs.c03.reflection.Calc");
//		Class<?> clazz = Calc.class;
//		Class<?> clazz = (new Calc()).getClass();
		Object obj = clazz.newInstance();
		
		Method addMethod = clazz.getMethod("add", new Class[]{int.class,int.class});
		Object result = addMethod.invoke(obj, new Object[]{1,2});
		System.out.println((Integer)result);
		
		System.out.println("********************");
		
		Method helloMethod = clazz.getDeclaredMethod("hello", new Class[]{String.class});
		helloMethod.setAccessible(true);
		Object strResult = helloMethod.invoke(obj, new Object[]{"World"});
		System.out.println((String)strResult);	

	}

}
