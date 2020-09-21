package com.demo.io.data;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromFileWithDIS {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis= null;
		
		//System.out.println(dis.readInt());
		//System.out.println(dis.readUTF());
		//System.out.println(dis.readUTF());
		//System.out.println(dis.readDouble());
		
		try {
			
			 fis = new FileInputStream(new File("D:\\training_hsbc\\io\\mydata.txt"));
			
			 bis = new BufferedInputStream(fis);
			
			 dis  = new DataInputStream(bis);
			 
			 while(true) {
				int id = dis.readInt();
				String name = dis.readUTF();
				String city = dis.readUTF();
				double salary = dis.readDouble();
				System.out.println(id+" "+name+" "+city+" "+salary);
			 }
		}catch(FileNotFoundException e) {
			System.out.println(e);
			
		}catch(EOFException e) {
			System.out.println("done reading");
		}catch(IOException e) {
			System.out.println(e);
		}
		dis.close();

	}

}
