package Question6;
/***
 * 
 * @author Abhi Zanzarukiya
 *
 */

public class MethodOverloading {
	
	public static void displayer(int x) {
		System.out.println("Displaying int which is "+x);
	}
	public static void displayer(float x) {
		System.out.println("Displaying float which is "+x);
	}
	
	public static void displayer(String s,float x) {
		System.out.println("Displaying string and float which is "+s+" and "+x);
	}
	
	public static void displayer(String s,int x) {
		System.out.println("Displaying string and int which is "+s+" and "+x);
	}

	/**
	 * Performs overloading example
	 * @param args
	 */
	public static void main(String[] args) {
	
			MethodOverloading disp = new MethodOverloading();
			
			disp.displayer(10);
			
			disp.displayer(10.4f);
			
			disp.displayer("Abhi",10);
			
			disp.displayer("Abhi", 20.3f);

	}

}
