package cn.tju.scs.c06.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Name("ffff1","l1"));
		c.add(new Name("f2","l2"));
		c.add(new Name("fff3","l3"));
		
		Iterator i = c.iterator();
		
		while(i.hasNext()){
			Name n = (Name)i.next();
			System.out.println(n.getFirstName());
		}
		System.out.println("---------------------");
		for (Iterator iterator = c.iterator(); iterator.hasNext();) {
			Name name = (Name) iterator.next();
			if (name.getFirstName().length() < 3){
				iterator.remove();
			}
			
		}
		System.out.println(c);

	}

}
