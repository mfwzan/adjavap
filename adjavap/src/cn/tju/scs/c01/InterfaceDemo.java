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

class Star implements Drawable{

	@Override
	public void draw() {
		System.out.println("Drawing Star");
	}
	
}

class DrawFactory{
	public Drawable DrawFactory(String s) throws Exception{
		if ("Circle".equals(s)){
			return new Circle();
		} else if ("Rectangle".equals(s)){
			return new Rectangle();
		} else if ("Square".equals(s)){
			return new Square();
		} else if ("Star".equals(s)){
			return new Star();
		}
		return null;
//		Drawable d ;
//		
//		Class<?> c = Class.forName("cn.tju.scs.c01." + s);
//		Object obj = c.newInstance();
//		d = (Drawable)obj;
//		return d;
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) throws Exception {
		DrawFactory factory = new DrawFactory();
		Drawable d = factory.DrawFactory("Star");
		d.draw();

	}

}
