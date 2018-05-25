package cn.tju.scs.c03;
import java.lang.reflect.Field;

import sun.misc.*;
class Player{
	private int age = 12;
	private Player(){
		this.age = 50;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
}

public class TestUnsafe {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
//		Field f = Unsafe.class.getDeclaredField("theUnsafe");

	}

}
