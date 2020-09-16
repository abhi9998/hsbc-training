package Question7;
/***
 * 
 * @author Abhi Zanzarukiya
 *
 */

public class HelloMethod {
	
	public static void hello(short x) {
		System.out.println("hello from short catcher to "+x);
	}
	
	public static void hello(int x) {
		System.out.println("hello from int catcher to "+x);
	}
	
	public static void hello(byte x) {
		System.out.println("hello from byte catcher to "+x);
	}
	
	public static void hello(long x) {
		System.out.println("hello from long catcher to "+x);
	}

	/**
	 * Check the catching method for hello(5)
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new HelloMethod().hello(5);
	}

}
