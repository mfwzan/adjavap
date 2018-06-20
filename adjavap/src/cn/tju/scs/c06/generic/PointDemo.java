package cn.tju.scs.c06.generic;

class Point{
	private Object x;
	private Object y;
	public Object getX() {
		return x;
	}
	public void setX(Object x) {
		this.x = x;
	}
	public Object getY() {
		return y;
	}
	public void setY(Object y) {
		this.y = y;
	}
	
}

public class PointDemo {
	public static void main(String[] args) {
		Point p = new Point();
		p.setX(10.2);
		p.setY(20.2);
		
//		p.setX("东经30");
//		p.setY("北纬20");
		
//		p.setX("东经30");
//		p.setY(10);
		
		double x = (Double)p.getX();
		double y = (Double)p.getY();
		
		System.out.println("x坐标："+x + ",  y坐标：" + y);
	}
}
