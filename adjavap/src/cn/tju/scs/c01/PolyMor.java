package cn.tju.scs.c01;

class Animal{
	int num = 10;
	static int age = 20;
	public void eat(){
		System.out.println("动物吃饭");
	}
	public static void sleep(){
		System.out.println("动物睡觉");
	}
	
	public void run(){
		System.out.println("动物在跑");
	}
}

class Cat extends Animal{
	int num = 80;
	static int age = 90;
	String name = "tomcat";
	
	public void eat(){
		System.out.println("猫吃饭");
	}
	public static void sleep(){
		System.out.println("猫睡觉");
	}
	
	public void catchMouse(){
		System.out.println("猫在抓老鼠");
	}
}

public class PolyMor {

	public static void main(String[] args) {
		Animal am = new Cat();
		am.eat();
		am.sleep();
		am.run();
		

		System.out.println(am.num);
		System.out.println(am.age);
		
		System.out.println("--------------------");
		Cat ct = (Cat)am;
		ct.eat();
		ct.catchMouse();
		ct.run();
		ct.sleep();
		System.out.println(ct.name);
		System.out.println(ct.num);
		System.out.println(ct.age);

	}

}
