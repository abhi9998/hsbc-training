package com.demo.filedemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderWriterDemo {
	
	/**
	 * @param args
	 */
	public static void main(String[] args)  {
		File file = new File("D:\\training_hsbc\\io\\demo.txt");
		FileWriter  fos= null;
		FileReader fis = null; 
		BufferedReader bis = null;
		BufferedWriter bos = null;
		String str[] = new String[15];
		str[0]="Abhi";
		str[1]="Abhi1 is name";
		str[2]="Abhi2 is name";
		str[3]="Abhi3 is name";
		str[4]="Abhi4 is name";
		str[5]="Abhi5";
		str[6]="Abhi6";
		str[7]="Abhi7";
		
		
		try {
		fos = new FileWriter("D:\\\\training_hsbc\\\\io\\\\demo_1.txt",true);
		//fis = new FileReader(file);
		//bis = new BufferedReader(Arrays.stream(str));
		bos = new BufferedWriter(fos);
		System.out.println(bis);
		int data = 0;
		
		for(int i=0;i<str.length;i++) {
			if(str[i]==null)
				break;
			else {
				bos.write(str[i]);
				bos.write("\n");
			}
		}
		
	
		//while((data = str.readLine())!=null) {
		//	System.out.print((char) data);
			//bos.write(data);
		//	}
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
