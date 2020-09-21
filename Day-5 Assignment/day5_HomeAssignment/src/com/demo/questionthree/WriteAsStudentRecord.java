package com.demo.questionthree;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */

public class WriteAsStudentRecord {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileOutputStream fos = new FileOutputStream("student.txt",true);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		DataOutputStream dos =  new DataOutputStream(bos);
		
		Student stu[]= new Student[5];
		for(int i=0;i<stu.length;i++) {
			stu[i]= new Student(i,"Abhi"+i,i);
		}
		
		writeToFile(dos,stu);

	}
	
	public static void writeToFile(DataOutputStream dos , Student[] stu) throws IOException {
		
		for(int i=0;i<stu.length;i++) {
			dos.writeInt(stu[i].getStdId());
			dos.writeUTF(stu[i].getName());
			dos.writeInt(stu[i].getStandard());
		}
		
		System.out.println("Written to the file");
		dos.close();
	}

}
