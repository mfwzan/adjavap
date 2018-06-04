package cn.tju.scs.c06.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortedListDemo {

	public static void main(String[] args) {
		List l1 = new LinkedList();
		l1.add(new Name("Karl","M"));
		l1.add(new Name("Tom","Z"));
		l1.add(new Name("Jeff","T"));
		l1.add(new Name("John","M"));
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);

	}

}
