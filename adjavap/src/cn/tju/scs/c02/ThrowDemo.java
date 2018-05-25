package cn.tju.scs.c02;

public class ThrowDemo {
	public static void main(String[] args) {
		try {
			throw new Exception("自定义异常！");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("test");
	}
}
