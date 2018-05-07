package cn.tju.scs.c01;

public class BikeFinalPara {
	int cube(final int n){
//		n = n+1;
		return n*n*n;
	}

	public static void main(String[] args) {
		System.out.println(new BikeFinalPara().cube(5));

	}

}
