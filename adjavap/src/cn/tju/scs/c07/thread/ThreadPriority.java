package cn.tju.scs.c07.thread;

public class ThreadPriority {

	public static void main(String[] args) {
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.currentThread().getPriority());

	}

}
