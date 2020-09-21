package com.demo.questionone;

import java.io.File;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class FileAtributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f1 = new File("fileattibute.txt");
		
		System.out.println("File Name: " + f1.getName());
		System.out.println("Path: " + f1.getPath());
		System.out.println("Abs Path: " + f1.getAbsolutePath());
		System.out.println("Parent: " + f1.getParent());
		System.out.println("File exists : "+f1.exists());
		System.out.println("The File is writable :"+f1.canWrite());
		System.out.println("The file is readable : "+f1.canRead());
		System.out.println("The File is a directory : "+f1.isDirectory());
		System.out.println("File last modified: " + f1.lastModified());
		System.out.println("File size: " + f1.length() + " Bytes");


	}

}
