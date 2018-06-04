package cn.tju.scs.c05.file;

public class Recursive {
	//循环计算阶乘
	public int compute(int number) {
		int result = 1;
		for (int i = number; i > 0; i--) {
			result *=i;
		}
		return result;
	}
	
	//使用递归
	public int couputeRecur(int number){
		
		if (1==number){
			return 1;
		} else{
			return number * couputeRecur(number - 1);
		}
		
	
	}
	public static void main(String[] args) {
		Recursive test = new Recursive();
		System.out.println(test.compute(5));
		System.out.println(test.couputeRecur(5));
	}

}
