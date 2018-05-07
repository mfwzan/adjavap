package cn.tju.scs.c01;

public class Test1 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String");
		
		System.out.println(clazz.getClassLoader());
		
		Class clazz2 = Class.forName("cn.tju.scs.c01.C");
		System.out.println(clazz2.getClassLoader());

	}

}

class C
{
	}
