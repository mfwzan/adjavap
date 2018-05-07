package cn.tju.scs.c01;

public class PrintInterface implements printable2 {

	@Override
	public void print() {
		System.out.println("Hello");

	}

	public static void main(String[] args) {
		PrintInterface pi = new PrintInterface();
		pi.print();

	}

}
