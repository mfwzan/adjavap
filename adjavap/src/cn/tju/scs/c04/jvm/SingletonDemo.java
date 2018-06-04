package cn.tju.scs.c04.jvm;

public class SingletonDemo {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.counter1);
		System.out.println(singleton.counter2);

	}

}
