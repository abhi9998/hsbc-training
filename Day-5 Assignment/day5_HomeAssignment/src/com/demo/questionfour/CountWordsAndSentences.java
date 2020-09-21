package com.demo.questionfour;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
/***
 * 
 * @author Abhi Zanzarukiya
 *
 */

public class CountWordsAndSentences {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new FileReader("readforcount.txt"));
		int c;
		int countWord=0;
		int countSentence=0;
		while((c =br.read())!=-1) {
			if((char)c=='.') {
				countSentence++;
				countWord++;
			}else if((char)c ==' ') {
				countWord++;
			}else {
				
			}
		}
		
		br.close();
		System.out.println("No of words are "+countWord);
		System.out.println("No of senctences are "+countSentence);

	}

}
