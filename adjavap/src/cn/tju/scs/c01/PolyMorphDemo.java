package cn.tju.scs.c01;

class PA{
	public void print() {
		System.out.println("Print() A");

	}
}

class PB extends PA{
	public void print() {
		System.out.println("Print() B");
		
	}
}

class PC extends PA{
	public void print(){
		System.out.println("Print() C");
	}
}

public class PolyMorphDemo {

	public static void main(String[] args) {
		PA a = new PB();
		PA a2 = new PA();
		
		if (a2 instanceof PB){
			PB b = (PB)a2;
			b.print();
		}
		
		if (a instanceof PB){
			PB b2 = (PB)a;
			b2.print();
		}
		a2.print();
		
		

	}

}
