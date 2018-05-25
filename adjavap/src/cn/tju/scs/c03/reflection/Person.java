package cn.tju.scs.c03.reflection;

public class Person implements IPerson {
	public String gender;
	private int height;
	private double weight;
	public String name;
	public int age;

	@Override
	public int AddAge(int age) {
		return age + 1;
	}

}
