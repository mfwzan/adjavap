package cn.tju.scs.c01;

public class StudentStatic {
	 int rollno;  
	 String name;  
	 static String college ="ITS";  
	     
	 StudentStatic(int r,String n){  
	   rollno = r;  
	   name = n;  
	   }  
	 void display (){
		 System.out.println(rollno+" "+name+" "+college);
		 }  
	  
	 public static void main(String args[]){  
		 StudentStatic s1 = new StudentStatic(111,"Karan");  
		 StudentStatic s2 = new StudentStatic(222,"Aryan");  
		   
		 s1.display();  
		 s2.display();  
	 }  

	
}
