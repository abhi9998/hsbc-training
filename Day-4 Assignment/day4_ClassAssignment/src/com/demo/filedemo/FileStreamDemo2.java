package com.demo.filedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo2 {
	
	public static void main(String[] args)  {
		File file = new File("D:\\training_hsbc\\io\\demo.txt");
		FileOutputStream  fos= null;
		FileInputStream fis = null; 
		
		
		try {
		fos = new FileOutputStream("D:\\\\training_hsbc\\\\io\\\\demo_1.txt");
		fis = new FileInputStream(file);
		
		int data = 0;
		
	
		while((data = fis.read())!=-1) {
			System.out.print((char) data);
			fos.write(data);
			}
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}catch(IOException e ) {
			System.out.println(e);
		}finally {
			System.out.println("Finally");
			try {
				if(fis!=null)
				fis.close();
				
				if(fos!=null)
				fos.close();
				
			}
			catch(IOException e) {
				System.out.println("Streams coud not be close: "+e);
			}
			
		}
		System.out.println("End of task");
	}

}
