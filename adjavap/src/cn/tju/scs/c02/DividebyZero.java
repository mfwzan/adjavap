package cn.tju.scs.c02;

public class DividebyZero {
//	public int divide(int a, int b) throws Exception{
//		return a/b;
//	}
	
	public int divide(int a, int b) {
		return a/b;
		}

	public static void main(String[] args) {
		DividebyZero dz = new DividebyZero();
//		try {
//			System.out.println(dz.divide(10, 0));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println(dz.divide(10, 2));
		
		System.out.println("Hello Zero");

	}

}
