package cn.tju.scs.c02;

class MyMath{
	public static int div(int x, int y) throws Exception{
		int result = 0;
		System.out.println("Divide start...");
		
		try{
			result = x / y;
		} catch(Exception e){
			throw e;
		} finally{
			System.out.println("Divide end");
			return result;
		}
		
		
		
	}
}

public class ExceptUseDemo {

	public static void main(String[] args) {
		try {
			System.out.println(MyMath.div(10, 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
