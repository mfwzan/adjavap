package cn.tju.scs.c06.generic;

interface IMessage<T>{//设置泛型接口
	public void print(T t);
}

//1. 子类也继续使用泛型，并且父接口
//class MessageImpl<T> implements IMessage<T>{
//	public void print(T t) {
//		System.out.println(t);
//	}
//}

//2. 
class MessageImpl implements IMessage<String>{
	public void print(String t) {
		System.out.println(t);
	}
}


public class GinterfaceDemo {

	public static void main(String[] args) {
		IMessage<String> msg = new MessageImpl();
		msg.print("Hello World!");

	}

}
