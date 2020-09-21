package com.demo.filedemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo2 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args)  {
		File file = new File("D:\\training_hsbc\\io\\demo.txt");
		FileOutputStream  fos= null;
		FileInputStream fis = null; 
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		
		try {
		fos = new FileOutputStream("D:\\\\training_hsbc\\\\io\\\\demo_1.txt",true);
		fis = new FileInputStream(file);
		//System.out.println(fis.available()+"here");
		bis = new BufferedInputStream(fis);
		bos = new BufferedOutputStream(fos);
		
		int data = 0;
		
	
		while((data = bis.read())!=-1) {
			System.out.print((char) data);
			bos.write(data);
			}
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}catch(IOException e ) {
			System.out.println(e);
		}finally {
			System.out.println("Finally");
			try {
				if(fis!=null||bis!=null) {
			//	fis.close();
				bis.close();
				}
				
				if(fos!=null||bos!=null) {
			//	fos.close();
				bos.close();
				}
				
			}
			catch(IOException e) {
				System.out.println("Streams coud not be close: "+e);
			}
			
		}
		System.out.println("End of task");
	}

}
