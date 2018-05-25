package cn.tju.scs.c03;

public class TestGC {

	public static void main(String[] args) {
		byte[] b = null;
		for (int i = 0; i < 10; i++) {
			b = new byte[1*1024*1024];
		}

	}

}
