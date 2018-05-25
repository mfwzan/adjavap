package cn.tju.scs.c03.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 该代理类的内部属性是Object类型，实际使用的时候通过该类的构造方法传递进来一个对象
 * 此外，该类还实现了invoke方法，该方法中的method.invoke其实就是调用被代理对象的将来执行的方法，
 * 方法参数是obj,表示该方法从属于obj，通过动态代理类，我们可以在执行真是对象的方法前后加入额外的一些方法
 * @author Zan Wang
 *
 */
public class DynamicSubject implements InvocationHandler {
	private Object obj;
	Date t1, t2;
	long dateDiff;
	
	public DynamicSubject(Object obj) {
		this.obj = obj;
	} 

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		t1 = new Date(System.currentTimeMillis());
		System.out.println("租房前的时间: " + new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss:SSS").format(t1));
		
		method.invoke(obj, args);
		
		t2 = new Date(System.currentTimeMillis());
		System.out.println("租房后的时间: " + new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss:SSS").format(t2));
		
		dateDiff = t2.getTime() - t1.getTime(); 
		System.out.println(dateDiff + "毫秒完成了租房");
		return null;
	}

}
