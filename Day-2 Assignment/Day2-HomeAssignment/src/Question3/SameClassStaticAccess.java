package Question3;
/***
 * 
 * @author Abhi Zanzarukiya
 *
 */

public class SameClassStaticAccess {
	
	static String accessStatic = "Accessed";
	/***
	 * This class defines static variable and different access patterns of it
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//accessing directly in main method
		System.out.println(accessStatic+" from main method directly");
		
		//accessing with class name
		System.out.println(SameClassStaticAccess.accessStatic+" with class name");
		
		new SameClassStaticAccess().callNonStatic();

	}
	public void callNonStatic() {
		
		//accessing from non static method
		System.out.println(accessStatic+" from non static method directly");
		
		
		
	}

}
