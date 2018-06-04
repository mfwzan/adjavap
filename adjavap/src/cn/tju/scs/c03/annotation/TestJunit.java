package cn.tju.scs.c03.annotation;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit {
	/**
	 * 1. Annotation和Reflection结合的，两位Java大师在飞机上写出来的
	 * 2. 反射存在的意义
	 * 3. @Test标识是测试方法，然后呢？
	 */
	
	@Test
	public void testAdd() {
		System.out.println("Test JUnit");
	}

}

