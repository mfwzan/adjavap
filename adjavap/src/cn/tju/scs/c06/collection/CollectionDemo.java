package cn.tju.scs.c06.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

class Name implements Comparable{
	private String firstName;
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String lastName;
	
	public Name(String f, String l){
		this.firstName = f;
		this.lastName = l;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.firstName + "/" + this.lastName;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Name){
			Name name = (Name)obj;
			return (firstName.equals(name.firstName))&&
					(lastName.equals(name.lastName));
		}
			
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return firstName.hashCode();
	}

	@Override
	public int compareTo(Object o) {
		Name n = (Name)o;
		int lastCmp = lastName.compareTo(n.lastName);
		return (lastCmp!=0?lastCmp:firstName.compareTo(n.firstName));
	}
}

public class CollectionDemo {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Name("Wang", "Tian"));
		c.add(new Integer(100));
		c.add("Test");
		
		System.out.println(c.size());
		System.out.println(c);
		System.out.println("------------------------");
		c.remove(new Integer(100));
		c.remove("Test");
		c.remove(new Name("Wang","Tian"));
		System.out.println(c.size());
		System.out.println(c);
		
		Collection cc = new LinkedList();
		cc.add(new Name("f1","L1"));
		cc.add(new Name("f2","L2"));
		System.out.println(cc.contains(new Name("f2","L2")));
		cc.remove(new Name("f1","L1"));
		System.out.println(cc);

	}

}
