package cn.tju.scs.c02;

class AddException extends Exception{
	public AddException(String msg){
		super(msg);
	}
}

public class AddExceptionDemo {

	public static void main(String[] args) {
		int num = 20;
		if (num > 10){
			try {
				throw new AddException("数值过大！");
			} catch (AddException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
