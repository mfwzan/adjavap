package cn.tju.scs.c02;

public class ExceptionTryDemo {
	public static void main(String[] args) {
		System.out.println("1. Division start...");
		try{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			System.out.println("2. Division:" + (x/y));
			System.out.println("----------------"); // Not Executed.
		} catch(ArithmeticException e){
			System.out.println("*****Exception Found**********");
			e.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		} catch(NumberFormatException e){
			e.printStackTrace();
		} 
		finally{
			System.out.println("$$ No matter whether exception was found or not");
		}
		System.out.println("3. Division End");
	}
}
