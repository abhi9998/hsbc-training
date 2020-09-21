package com.demo.filedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo {
	
	public static void main(String[] args) throws FileNotFoundException,IOException {
		File file = new File("D:\\training_hsbc\\io\\demo.txt");
		
		FileOutputStream fos = new FileOutputStream("D:\\\\training_hsbc\\\\io\\\\demo_1.txt");
		FileInputStream fis = new FileInputStream(file);
		int data = 0;
		
	//	while(true) {
	//		data=fis.read();
	//		if(data==-1)
	//			break;
	//		System.out.print((char) data);
	//	}
		
		while((data = fis.read())!=-1) {
			System.out.println((char) data);
			fos.write(data);
		}
	}

}
