package cn.tju.scs.c04.jvm;

public class TestJVM {

	public static void main(String[] args) {
		byte[] b = null;
		for (int i = 0; i < 10; i++) {
			b = new byte[1*1024*1024];
		}
		System.out.println("分配了1M空间给数组");
		System.out.print("Xmx=");
		System.out.println(Runtime.getRuntime().maxMemory()/1024.0/1024.0 + "M");
		
		System.out.print("Free mem = ");
		System.out.println(Runtime.getRuntime().freeMemory()/1024.0/1024.0 + "M");
		
		System.out.print("Total mem =");
		System.out.println(Runtime.getRuntime().totalMemory()/1024.0/1024.0 + "M");

	}

}
