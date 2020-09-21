package com.demo.filedemo;

import java.io.File;

public class FileDemo {
	
	public static void main(String[] args) {
		File file = new File("D:\\training_hsbc\\io");
		
		//file.isDirectory()?(System.out.println("Its a directory")):(System.out.println("Its not a directory"));
		
		System.out.println("Directory:" + file.isDirectory());
		System.out.println("Is writable: "+file.canWrite());
	}

}
