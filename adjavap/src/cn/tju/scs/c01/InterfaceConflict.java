package cn.tju.scs.c01;

interface Test11{
	void show();
	default void run1(){
		System.out.println("Test11 run1");
	}
	static void run2(){
		System.out.println("Test11 run2");
	}
}

interface Test22{
	void show();
	default void run1(){
		System.out.println("Test22 run1");
	}
	
	static void run2(){
		System.out.println("Test22 run2");
	}
}

class TestInterface implements Test11,Test22{  
    @Override  
    public void show(){  
        Test22.super.run1();  
    }  
  
    @Override  
    public void run1() {          
        Test11.super.run1();  
    }  
      
}  
public class InterfaceConflict {

	public static void main(String[] args) {
		Test11.run2();
		Test22.run2();
//		TestInterface.run2();
		
		TestInterface test = new TestInterface();
		test.show();
		test.run1();

	}

}
