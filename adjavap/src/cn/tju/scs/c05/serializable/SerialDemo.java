package cn.tju.scs.c05.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Book implements Serializable{
	
	//序列号的版本编号
	private static final long serialVersionUID = 1L;
	private String title;
	private double price;
	public Book(String title, double price){
		this.title = title;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "书名：" + this.title + ", 价格" + this.price;
	}
}

public class SerialDemo {
	public static void main(String[] args) throws Exception {
		ser();
		unser();
	}
	
	public static void ser() throws Exception{
		File file = new File("E:" + File.separator + "demo" +File.separator + "book.ser");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(new Book("TTTT",29.2));
		oos.close();
	}
	
	public static void unser() throws Exception{
		File file = new File("E:" + File.separator + "demo" +File.separator + "book.ser");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		Object obj = ois.readObject();
		Book book = (Book)obj;
		ois.close();
		System.out.println(book);
	}

}
