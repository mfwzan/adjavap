package cn.tju.scs.c01;

public class StudentStaticMethod {
	 int rollno;  
	 String name;  
	 static String college ="SCS";  
	 
	 static void change(){
		 college = "SS";
	 }
	     
	 StudentStaticMethod(int r,String n){  
	   rollno = r;  
	   name = n;  
	   }  
	 void display (){
		 System.out.println(rollno+" "+name+" "+college);
		 }  
	  
	 public static void main(String args[]){  
		 StudentStaticMethod.change();
		 StudentStaticMethod s1 = new StudentStaticMethod(111,"Karan");  
		 StudentStaticMethod s2 = new StudentStaticMethod(222,"Aryan"); 
		 StudentStaticMethod s3 = new StudentStaticMethod(333, "Sonoo");
		   
		 s1.display();  
		 s2.display();  
		 s3.display();
	 }  

	
}
