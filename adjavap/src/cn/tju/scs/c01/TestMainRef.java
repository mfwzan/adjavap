package cn.tju.scs.c01;

public class TestMainRef {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();		
		car1.name = "大众";
		car1.price = 20.5;		
		car2.name = "丰田";
		car2.price = 18.2;		
		car1.getCarInfo();
		car2.getCarInfo();		
		Car car3 = null;
		car3 = car1;		
		car3.price = 22.2;
		System.out.println("----------------");
		car1.getCarInfo();
		car3.getCarInfo();
	}

}
