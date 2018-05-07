package cn.tju.scs.c01;

public class BikeFinalStatic {
	static final int data;
//	public BikeFinalStatic(){
//		data = 100;
//	}
	
	static{
		data = 100;
	}

	public static void main(String[] args) {
		System.out.println(BikeFinalStatic.data);

	}

}
