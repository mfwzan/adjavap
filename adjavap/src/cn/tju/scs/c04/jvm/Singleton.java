package cn.tju.scs.c04.jvm;

public class Singleton {
     public static int counter1;     
     public static int counter2 = 0;
     private static Singleton singleton = new Singleton();
     public static int counter3 = 0;
     public static int counter4;
     
	 private Singleton()	 {
		 counter1++;
		 counter2++;
		 counter3++;
		 counter4++;
	 }
	 
	 public static Singleton getInstance()	 {
		 return singleton;
		 }
}
