package cn.tju.scs.c03.annotation;

@MyAnnotation(hello = "TJU",world="SCS")
public class MyAnnTest {
	@MyAnnotation(hello = "TJU2",world="SCS2")
	public void output(){
		System.out.println("TEst");
	}

}
