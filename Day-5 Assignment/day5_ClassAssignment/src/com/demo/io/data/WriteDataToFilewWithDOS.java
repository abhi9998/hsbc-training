package com.demo.io.data;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class WriteDataToFilewWithDOS {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		FileOutputStream fos = new FileOutputStream("D:\\training_hsbc\\io\\mydata.txt",true);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		DataOutputStream dos =  new DataOutputStream(bos);
		
		dos.writeInt(100);
		dos.writeUTF("Abhi");
		dos.writeUTF("Junagadh");
		dos.writeDouble(120.0);
		dos.close();

	}

}
