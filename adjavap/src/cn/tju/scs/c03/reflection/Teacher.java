package cn.tju.scs.c03.reflection;

public class Teacher extends Person {
	private static int counter = 100;
	private static void testStatic() {
		System.out.println("static test()");
	}
	
	private double salary;
	
	public Teacher(){
		
	}
	
	private Teacher(String name, int age, double salary){
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	 public void eat(String something) {  
	    System.out.println("老师在吃" + something);  
	 }  
	      
	 public void eat(String something, int time) {
		 System.out.println("老师在吃" + something + "吃了" + time + "小时");
	 }  
	 
	 @Override  
	 public String toString() {  
	     return "Teacher [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	 }  
	  

}
