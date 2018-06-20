package cn.tju.scs.c06.generic;

class Point2<T>{
	private T x;
	private T y;
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	
}

public class PointDemoT {
	public static void main(String[] args) {
		Point2<String> p = new Point2<>();
//		p.setX(10.2);
//		p.setY(20.2);
		
//		p.setX("东经30");
//		p.setY("北纬20");
		
		p.setX("东经30");
		p.setY("北纬20");
		
		String x = (String)p.getX();
		String y = (String)p.getY();
		
		System.out.println("x坐标："+x + ",  y坐标：" + y);
	}
}
