package cn.tju.scs.c01;

public class ThisTest {
	private int i = 0;
	
	ThisTest(int i){
		this.i = i + 1;
		System.out.println("1--Int constructor i---this.i:" + "i" + "---" + this.i);
		System.out.println("2--i - 1:" + (i - 1) + "   this.i+1:" + (this.i + 1));
	}
	
	ThisTest(String s){
		System.out.println("3--String constructor:" + s);
	}
	
	ThisTest(int i, String s){
		this(s);
		this.i = i++;
		System.out.println("4--Int constructor:" + i+ "/n" + "String constructor:" + s);
	}
	
	public ThisTest increment(){
		this.i++;
		return this;
	}

	public static void main(String[] args) {
		ThisTest tt0 = new ThisTest(10);
		ThisTest tt1 = new ThisTest("OK");
		ThisTest tt2 = new ThisTest(20,"OK Again!");
		System.out.println("5--"+tt0.increment().increment().increment().i);
	}

}
