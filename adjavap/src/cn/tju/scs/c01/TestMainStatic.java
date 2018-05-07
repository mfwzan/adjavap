package cn.tju.scs.c01;
public class TestMainStatic {
	public static void main(String[] args) {
		CarStatic car1 = new CarStatic();
		CarStatic car2 = new CarStatic();
		car1.setName("大众");
		car1.setPrice(-20.5);		
		car1.getCarInfo();
		car2.birthplace = "中国";
		System.out.println(car1.birthplace);
	}
}
