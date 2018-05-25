package cn.tju.scs.c03;

import java.net.URL;
import java.net.URLClassLoader;

public class ClassLoaderDemo {

	public static void main(String[] args) {
		URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
		for (int i = 0; i < urls.length; i++) {
			System.out.println(urls[i].toExternalForm());
		}
		
		System.out.println("----------------------");
		
		System.out.println(System.getProperty("java.ext.dirs"));
		
		ClassLoader extensionClassloader = ClassLoader.getSystemClassLoader().getParent();
		System.out.println("Parent of extension classloader:" + extensionClassloader.getParent());
		System.out.println("extension classloader can use these jars:");
		URL[] extURLs =  ((URLClassLoader)ClassLoader.getSystemClassLoader().getParent()).getURLs();
		
		for (int i = 0; i < extURLs.length; i++) {
			System.out.println(extURLs[i]);
		}
		
		System.out.println("-----------------------");
		
		System.out.println(System.getProperty("java.class.path"));
		System.out.println(ClassLoader.getSystemResource(""));
		ClassLoader systemClassloader = ClassLoader.getSystemClassLoader();
		
		System.out.println("The parent of system classloader:" + systemClassloader.getParent());

	}

}
