package cn.tju.scs.c03.reflection;

class CarRef{
	public CarRef(){
		System.out.println("******Car类的无参构造方法***********");
	}
	
	@Override
	public String toString() {
		return "This is a car!";
	}
}

public class ReflectionInstantiation {

	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("cn.tju.scs.c02.CarRef");
		Object obj = clazz.newInstance();

	}

}
