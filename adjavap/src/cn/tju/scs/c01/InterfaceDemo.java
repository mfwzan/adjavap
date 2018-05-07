package cn.tju.scs.c01;
interface Drawable{
	void draw();
}

class Rectangle implements Drawable{
	public void draw(){
		System.out.println("Drawing rectangle");
	}
}

class Circle implements Drawable{
	public void draw(){
		System.out.println("Drawing circle");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Drawable d = new Circle();
		d.draw();

	}

}
