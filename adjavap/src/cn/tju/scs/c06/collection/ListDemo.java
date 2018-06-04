package cn.tju.scs.c06.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List l1 = new ArrayList();
		
		for (int i = 0; i < 6; i++) {
			l1.add("a" + i);
		}
		
		System.out.println(l1);
		l1.add(3,"a100");
		System.out.println(l1);
		l1.add(6,"a200");
		System.out.println(l1);
		System.out.println(l1.get(2) + " ");
		System.out.println(l1.indexOf("a3"));
		l1.remove(1);
		System.out.println(l1);

	}

}
