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

class Square implements Drawable{
	public void draw(){
		System.out.println("Drawing Square");
	}
}

class DrawFactory{
	public Drawable DrawFactory(String s){
		if ("circle".equals(s)){
			return new Circle();
		} else if ("rectangle".equals(s)){
			return new Rectangle();
		} else if ("square".equals(s)){
			return new Square();
		}
		return null;
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		DrawFactory factory = new DrawFactory();
		Drawable d = factory.DrawFactory("square");
		d.draw();

	}

}
