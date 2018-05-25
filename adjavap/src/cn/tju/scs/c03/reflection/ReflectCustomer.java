package cn.tju.scs.c03.reflection;

import java.lang.reflect.Constructor;

class Customer{
	private Long id;
	private String name;
	private int age;
	
	public Customer(){
		super();
	}
	
	public Customer(Long id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + name + age;
	}
	
}

public class ReflectCustomer {
	
	public Object copy(Object object) throws Exception{
		Class<?> clazz = object.getClass();
//		Constructor cons = clazz.getConstructor(new Class[]{Long.class,String.class,int.class});
//		Object obj = cons.newInstance(new Object[]{12L,"test",2});
		
		Object obj = clazz.newInstance();
		System.out.println(obj);
			
		return null;
	}

	public static void main(String[] args) throws Exception {
		ReflectCustomer rc = new ReflectCustomer();
		rc.copy(new Customer(11L,"tome",1));

	}

}
