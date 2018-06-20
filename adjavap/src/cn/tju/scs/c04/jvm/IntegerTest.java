package cn.tju.scs.c04.jvm;

public class IntegerTest {

	public static void main(String[] args) {
		
		Integer i1 = 400;
		Integer i2 = 400;
		Integer i3 = 0;
		Integer i4 = new Integer(40);
		Integer i5 = new Integer(40);
		Integer i6 = new Integer(0);
		int i7 = 40;
		
		System.out.println("i1 = i2      \t" + (i1 == i2));
		System.out.println("i1 = i2 + i3 \t" + (i1 == i2 + i3));
		System.out.println("i4 = i5      \t"  + (i4 == i5));
		System.out.println("i4 = i5 + i6 \t" + (i4 == i5 + i6));
		System.out.println("i7 = i4 \t" + (i7 == i4));
	}

}
