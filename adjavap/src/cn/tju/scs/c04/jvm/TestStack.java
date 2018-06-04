package cn.tju.scs.c04.jvm;

import org.junit.Test;

public class TestStack {
	private  int count = 0;
	public void recursion(){
		count++;
		recursion();
	}
	
	@Test
	public void testStack(){
		try{
			recursion();
		} catch(Throwable e){
			System.out.println("Deep of stack is " + count);
			e.printStackTrace();
		}
	}

	
//	public static void main(String[] args) {
//		TestStack ts = new TestStack();
//		try {
//			ts.recursion();
//		} catch(Exception e) {
//			System.out.println("deep of stack is " + ts.count);
//			e.printStackTrace();
//			
//		}
//	}

}
