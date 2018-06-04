package cn.tju.scs.c06.collection;

public class EqualsDemo {

	public static void main(String[] args) {
		int i1 = 400;
		int i2 = 400;
		Integer i3 = 400;
		Integer i4 = 400;
		
		double d1 = 40.4;
		double d2 = 40.4;
		Double d3 = 40.4;
		Double d4 = 40.4;
		
		float f1 = 300.23f;
		float f2 = 300.23f;
		Float f3 = 300.23f;
		Float f4 = 300.23f;
		
		char c1 = 'c';
		char c2 = 'c';
		Character c3 = 1112;
		Character c4 = (char)1112;		
		
		System.out.println("i1 = i2:" + (i1 == i2));
		System.out.println("i3 = i4:" + (i3 == i4));
		System.out.println("d1 = d2:" + (d1 == d2));
		System.out.println("d3 = d4:" + (d3 == d4));
		System.out.println("f1 = f2:" + (f1 == f2));
		System.out.println("f3 = f4:" + (f3 == f4));
		System.out.println("c1 = c2:" + (c1 == c2));
		System.out.println("c3 = c4:" + (c3 == c4) + "  " + c3);
		
		String s1 = "ab";
		String s2 = "cd";
		String s3 = "abcd";
		String s4 = "ab" + "cd";
		
		System.out.println("s3 = s1 + s2:" + (s3 == (s1 + s2)));
		System.out.println("s3 = s4:" + (s3 == s4));
				
				
		

	}

}
