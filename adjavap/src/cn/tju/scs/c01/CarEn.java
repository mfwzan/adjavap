package cn.tju.scs.c01;

public class CarEn {
	private String name;
	private double price;
	
	public CarEn(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	void getCarInfo(){
		System.out.println("汽车名称："+ getName() + "，汽车价格：" + getPrice());
	}
	
	@Override
	public String toString() {
		return "汽车名称："+ this.getName() + "，汽车价格：" + this.getPrice();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0){
			this.price = price;
		}	
	}
}
