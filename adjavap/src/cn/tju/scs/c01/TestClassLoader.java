package cn.tju.scs.c01;
/**
 * 
 * @author Zan Wang
 * 课前测试最后一道题，考察点：变量加载的顺序
 *
 */
class Singleton {
     private static Singleton singleton = new Singleton();
     public  static int counter1;     
     public  static int counter2 = 0;
     
     
     
     private Singleton()
     {
            counter1++;
            counter2++;
     }
     
     public static Singleton getInstance()
     {
            return singleton;
     }

}

public class TestClassLoader
{
     public static void main(String[] args) {
           Singleton singleton = Singleton. getInstance();
           System. out.println( "counter1 = " + singleton. counter1 );
           System. out.println( "counter2 = " + singleton. counter2);
     }
}

