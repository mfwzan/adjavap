package cn.tju.scs.c06.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set s = new HashSet();
		s.add("Hello");
		s.add("World");
		s.add(new Name("f1","f2"));
		s.add(new Integer(100));
		s.add(new Name("f1","f2"));
		s.add("Hello");
		
		System.out.println(s);

	}

}
