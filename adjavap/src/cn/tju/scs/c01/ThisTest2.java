package cn.tju.scs.c01;

class Father{
	private String name = "父类字段";
	Father(){
		System.out.println(this);
		System.out.println(this.name);
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

class Child extends Father{
	private String name = "子类字段";
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	};
}

public class ThisTest2 {

	public static void main(String[] args) {
		Father obj = new Child();
		Child obj2 = new Child();
		System.out.println(obj2.getName());

	}

}
