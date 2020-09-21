package com.demo.io.entity;

import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		RandomAccessFile raf = new RandomAccessFile("D:\\training_hsbc\\io\\lion.txt","r");
		raf.seek(100);
		
		
	}
	
	private static void printData(int seek,RandomAccessFile raf) throws Exception {
		raf.seek(seek);
		
		int x =0;
		
		while((x = raf.read())!=-1) {
			System.out.print((char)x);
		}
		}

}
