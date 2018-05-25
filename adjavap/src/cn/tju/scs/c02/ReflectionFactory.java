package cn.tju.scs.c02;

interface Fruit{
	public void eat();
}

class Apple implements Fruit{

	@Override
	public void eat() {
		System.out.println("吃苹果");
	}
	
}

class Banana implements Fruit{
	@Override
	public void eat() {
		System.out.println("吃香蕉");

	}
}

class Orange implements Fruit{
	@Override
	public void eat() {
		System.out.println("吃橘子");
		
	}
}

class Factory {
//	public static Fruit getInstance(String className){
//		if ("apple".equals(className)){
//			return new Apple();
//		} else if ("banana".equals(className)){
//			return new Banana();
//		} else{
//			return null;
//		}		
//	}
	
	public static Fruit getInstance(String className){
		Fruit f = null;
		try {
			f = (Fruit) Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
		
	}
}

public class ReflectionFactory {

	public static void main(String[] args) {
		Fruit f = Factory.getInstance("cn.tju.scs.c02.Orange");
		f.eat();

	}

}
