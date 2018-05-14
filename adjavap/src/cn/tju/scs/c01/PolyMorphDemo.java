package cn.tju.scs.c01;

class PA{
	public void print() {
		System.out.println("Print() A");
	}
	
	public void test(){
		System.out.println("Test A");
	}
}

class PB extends PA{
	public void print() {
		System.out.println("Print() B");		
	}
	
	public void funB(){
		System.out.println("NEW function of B");
	}
}

class PC extends PA{
	public void print(){
		System.out.println("Print() C");
	}
}

public class PolyMorphDemo {
	public static void main(String[] args) {
//		PA a = new PB();
//		a.print();
//		a.test();
		
//		PA a = new PB();
//		PB b = (PB)a;
//		b.print();
		
		/**
		 * 向上转型：
		 * 参数统一，可以调用子类覆写后的方法体。同一个方法针对不同的子类实现
		 */
//		PA a1 = new PB();
//		PA a2 = new PC();
//		
//		a1.print();
//		a2.print();
		
		/**
		 * 向下转型：
		 * 看不见子类的特殊方法，需要向下转型
		 */
//		PA a = new PB();
//		a.funB();
		
//		PA a = new PB();
//		PB b = (PB)a;
//		b.funB();
		
		PA a = new PB();
		fun(a);
				
	}
	
	public static void fun(PA a){
		PB b = (PB)a;
		b.funB();
	}

}
