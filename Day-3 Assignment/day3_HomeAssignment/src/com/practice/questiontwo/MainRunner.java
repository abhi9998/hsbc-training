package com.practice.questiontwo;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class MainRunner {

	public static void main(String[] args) {
		
		TvController controller;
		
		controller = new Bpl();
		controller.remoteName();
		
		controller = new Sony();
		controller.remoteName();
		
		controller = new Panasonic();
		controller.youtubeButton();

	}

}
