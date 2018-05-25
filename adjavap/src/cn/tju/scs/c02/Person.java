package cn.tju.scs.c02;

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
