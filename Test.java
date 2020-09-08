package demo01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	/**
	 * 词频统计
	 */
	public static void function_1(FileInputStream fis,FileOutputStream fos) throws IOException{
		BufferedInputStream bf = new BufferedInputStream(fis);
		BufferedOutputStream bo = new BufferedOutputStream(fos);
		byte[] bytes = new byte[1024];
		int read = bf.read(bytes);
		System.out.println(new String(bytes,0,read));
	}
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("D:\\无忧\\a.txt");
		FileOutputStream fos = new FileOutputStream("D:\\无忧\\b.txt");
		function_1(fis,fos);
	}
}
