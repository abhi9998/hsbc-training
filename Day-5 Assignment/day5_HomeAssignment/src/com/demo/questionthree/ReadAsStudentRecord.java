package com.demo.questionthree;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */

public class ReadAsStudentRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream(new File("student.txt"));
			
			 bis = new BufferedInputStream(fis);
			
			 dis  = new DataInputStream(bis);
			 Student stu[] = new Student[5];
			 int i=0;
			 while(true) {
				 int id =dis.readInt();
				 String name = dis.readUTF();
				 int standard = dis.readInt();
				 stu[i]= new Student(id,name,standard);
				
				 System.out.println(stu[i].toString());
				 i++;
			 }
			 
		}catch(EOFException e) {
			System.out.println("complete");
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}

	}

}
