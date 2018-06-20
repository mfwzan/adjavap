package cn.tju.scs.c06.generic;

class Message<T >{
	private T msg;
	public void setMsg(T msg) {
		this.msg = msg;
	}
	public T getMsg() {
		return msg;
	}
}

public class MessageDemo {

	public static void main(String[] args) {
		Message<String> m1 = new Message<>();
		m1.setMsg("aaaa");
		fun(m1);

	}
	
	public static void fun(Message<? super String> temp){
		temp.setMsg("Hello");
		System.out.println(temp.getMsg());
	}

}
