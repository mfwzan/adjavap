package cn.tju.scs.c03.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Documented
//@Retention(RetentionPolicy.RUNTIME)
//
//public @interface MyAnnotation {
//	String hello() default "TJU";
//	String world();
//
//}

public @interface MyAnnotation{
	String hello() ;
	String world();
}