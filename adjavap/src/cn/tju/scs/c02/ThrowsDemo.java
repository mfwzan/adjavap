package cn.tju.scs.c02;

class MathThrow{
	public static int div(int x, int y) {
		return x/y;
	}
}

public class ThrowsDemo {
	public static void main(String[] args)  {
		try {
			System.out.println(MathThrow.div(10, 0));
		} catch (Exception e) {
			e.printStackTrace();
		}
//		System.out.println(MathThrow.div(10, 0));
		System.out.println("tsss");
	}
}
