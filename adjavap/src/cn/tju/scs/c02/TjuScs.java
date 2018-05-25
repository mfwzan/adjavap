package cn.tju.scs.c02;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

@DescriptionAnn("TJUSCS will be the best software school in China")
class Scs{
	@Name(originate = "Tom", community="Java")
	public String getName(){
		return null;
	}
	
	@Name(originate = "Jack", community = "Python")
	public String getName2(){
		return "Test";
	}
}

public class TjuScs {

	public static void main(String[] args) throws Exception {
		String CLASS_NAME = "cn.tju.scs.c02.Scs";
		Class clazz = Class.forName(CLASS_NAME);
		Method[] method = clazz.getMethods();
		boolean flag = clazz.isAnnotationPresent(DescriptionAnn.class);
		if (flag){
			DescriptionAnn des = (DescriptionAnn)clazz.getAnnotation(DescriptionAnn.class);
			System.out.println("描述：" + des.value());
			System.out.println("----------------");
					
		}
		
		Set<Method> set = new HashSet<Method>();
		for (int i = 0; i < method.length; i++) {
			boolean Flag2 = method[i].isAnnotationPresent(Name.class);
			if(Flag2) set.add(method[i]);
		}
		
		for(Method m:set){
			Name name = m.getAnnotation(Name.class);
			System.out.print(name.originate());
			System.out.println("创建的语言:" + name.community());
		}
		

	}

}
