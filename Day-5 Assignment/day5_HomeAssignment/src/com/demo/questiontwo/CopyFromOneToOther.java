package com.demo.questiontwo;
/**
 * 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyFromOneToOther {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		System.out.println("Insert source file full path");
		BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
		
		String file1 = bis.readLine();
		
		System.out.println("Insert destination file full path");
		String file2 = bis.readLine();
		
		if((new File(file1)).exists()==false) {
			System.out.println("Source file do not exists");
		}else {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
			BufferedReader br = new BufferedReader(new FileReader(file1));
			String line ="";
			while((line=br.readLine())!=null) {
				bw.write(line);
			}
			bw.close();
			br.close();
			System.out.println("done copying text ");
		}
	}

}
