package cn.tju.scs.c03.reflection;

public class TeacherDemo {

	public static void main(String[] args) {
		Class<?> clazz = Teacher.class;
		System.out.println(clazz);
		Class<?> clazzPerson = clazz.getSuperclass();
		System.out.println(clazzPerson);
		Class<?> clazzIPerson = clazzPerson.getInterfaces()[0];
		System.out.println(clazzIPerson);
		
		

	}

}
