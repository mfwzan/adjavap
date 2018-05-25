package cn.tju.scs.c03.annotation;

@AnnotationTest(value = "hello",value2=EnumTest.Hello)
public class AnnotationClient {
	@AnnotationTest(value = "world",value2=EnumTest.World)
	public void method(){
		System.out.println("Usage of annotation");
	}
	
	public static void main(String[] args) {
		AnnotationClient client = new AnnotationClient();
		client.method();
	}

}
