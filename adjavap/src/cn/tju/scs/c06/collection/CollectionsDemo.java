package cn.tju.scs.c06.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		List l1 = new LinkedList();
		List l2 = new LinkedList();
		
		for (int i = 0; i < 10; i++) {
			l1.add("a" + i);
		}
		System.out.println(l1);
		Collections.shuffle(l1); //随机排列
		System.out.println(l1);
		Collections.reverse(l1); //逆序，LinkedList和ArrayList哪个快？
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		System.out.println(Collections.binarySearch(l1, "a5"));
		

	}

}
