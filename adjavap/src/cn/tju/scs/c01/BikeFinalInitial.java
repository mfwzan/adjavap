package cn.tju.scs.c01;

public class BikeFinalInitial {
	final int speedlimit; // blank final variable
	
	public BikeFinalInitial() {
		speedlimit = 100;
		System.out.println(speedlimit);
	}

	public static void main(String[] args) {
		new BikeFinalInitial();

	}

}
