package com.demo.exceptions;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Start of program..");
		try {
		int [] nums = {1,2,3,4};
	//	System.out.println(nums[4]);
		String[] names = new String[5];
		//names[2].length();
		System.out.println("No excception in try block");
		
	//	throw new RuntimeException();
		
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			//System.out.println(e);
			//System.out.println(e.getMessage());
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(NullPointerException e) {
			//e.printStackTrace();
			System.out.println(e);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("This is finally block");
		}
		//System.out.read();
		System.out.println("End of program..");

	}

}
