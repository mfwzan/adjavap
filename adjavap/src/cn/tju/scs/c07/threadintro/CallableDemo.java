package cn.tju.scs.c07.threadintro;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class CallThread implements Callable<String>{
	private int ticket = 10;
	@Override
	public String call() throws Exception {
		for (int i = 0; i < 100; i++) {
			if (ticket > 0 ){
				System.out.println("Ticket = " + this.ticket--);
			}
		}
		return "票已卖光";
	}
}

public class CallableDemo {
	public static void main(String[] args) throws Exception {
		CallThread ct1 = new CallThread();
		CallThread ct2 = new CallThread();
		FutureTask<String> task1 = new FutureTask<>(ct1);
		FutureTask<String> task2 = new FutureTask<>(ct2);
		
		new Thread(task1).start();
		new Thread(task2).start();
		System.out.println("A线程返回的结果：" + task1.get());
		System.out.println("B线程返回的结果：" + task2.get());
	}
	

}
