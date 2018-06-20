package cn.tju.scs.c07.thread;

import java.util.Random;

class Thread1 extends Thread{
	@Override  
    public void run() {  
        long startTime=System.currentTimeMillis();  
        long addResult=0;  
        for (int i = 0; i < 1000000; i++) {  
            new Random().nextInt();  
            addResult+=i;  
        }  
        long endTime=System.currentTimeMillis();  
        System.out.println("thread1 use time--->"+(endTime-startTime));  
    }  
}

class Thread2 extends Thread{
	@Override  
    public void run() {  
        long startTime=System.currentTimeMillis();  
        long addResult=0;  
        for (int i = 0; i < 1000000; i++) {  
            new Random().nextInt();  
            addResult+=i;  
        }  
        long endTime=System.currentTimeMillis();  
        System.out.println("thread2 use time--->"+(endTime-startTime));  
    }  
}

public class PriorityDemo {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {  
            Thread1 t1=new Thread1();  
            t1.setPriority(10);  
            t1.start();  
            Thread2 t2=new Thread2();  
            t2.setPriority(1);  
            t2.start();  
        }  

	}

}
