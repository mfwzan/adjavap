package cn.tju.scs.c02;

class CarRef{
	public CarRef(String s){
		System.out.println(s+ "******Car类的无参构造方法***********");
	}
	
	public CarRef(){
		System.out.println("******Car类的无参构造方法***********");
	}
	
//	@Override
//	public String toString() {
//		return "This is a car!";
//	}
}

public class ReflectionInstantiation {

	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("cn.tju.scs.c02.CarRef");
		Object obj = clazz.newInstance();

	}

}
