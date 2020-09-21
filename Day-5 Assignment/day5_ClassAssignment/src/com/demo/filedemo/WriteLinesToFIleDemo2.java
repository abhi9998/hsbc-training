package com.demo.filedemo;

import java.io.FileWriter;

public class WriteLinesToFIleDemo2 {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		
		String lines[] = new String[20];
		for(int i=0;i<20;i++) {
			lines[i]="line no "+ i;
		}
		
		FileWriter fwriter = new FileWriter("demo_2.txt");
		int i=0;
		while(i<20) {
			if(lines[i]!=null) {
			fwriter.write(lines[i]);
			fwriter.write("\n");
			}
			i++;
		}
		fwriter.flush();

	}

}
