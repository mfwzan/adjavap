package cn.tju.scs.c02;

class Car{
	@Override
	public String toString() {
		return "This is a Car";
	}
}

class CarSW<T>{
	private T title;
	public void setTitle(T title){
		this.title = title;
	}
}
public class AnnotationDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		System.out.println(new Car());
		CarSW carsw = new CarSW();
		carsw.setTitle("BMW");

	}

}
