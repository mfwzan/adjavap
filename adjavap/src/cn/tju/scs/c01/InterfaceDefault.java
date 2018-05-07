package cn.tju.scs.c01;
interface Drawable4{
	void draw();
	default void msg(){
		System.out.println("default method");
	}
	
	static int cube(int x){
		return x*x*x;
		}  
}

class Rectangle4 implements Drawable4{
	public void draw(){
		System.out.println("Drawing rectangle");
	}
}

public class InterfaceDefault {
	public static void main(String[] args) {
		Drawable4 d = new Rectangle4();
		d.draw();
		d.msg();
		System.out.println(Drawable4.cube(5));

	}

}
