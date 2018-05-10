package cn.tju.scs.c01;

public class OverPromotion {
	double i;
	public OverPromotion(double i){
		this.i = i + 1;
		System.out.println(this.i);
	}
	
	public static void main(String[] args) {
		OverPromotion op = new OverPromotion(10L);
	}

}
