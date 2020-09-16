package Question4;
/***
 * 
 * @author Abhi Zanzarukiya
 *
 */

public class OrdinaryMethodStaticAccess {

	static String accessStatic = "Accessed";
	/***
	 * This program is to access static variable from non static method
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new OrdinaryMethodStaticAccess().ordinaryMethod();

	}
	
	public void ordinaryMethod() {
		System.out.println(accessStatic+" from ordinary method");
	}

}
