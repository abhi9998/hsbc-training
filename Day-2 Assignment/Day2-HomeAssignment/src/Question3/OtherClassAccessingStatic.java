package Question3;
/***
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class OtherClassAccessingStatic {
	/***
	 * This program access static variable of other class
	 * @param args
	 */
	public static void main(String[] args) {
		
		//access by class name of static variable
		System.out.println(SameClassStaticAccess.accessStatic+" from other class using class name of static variable");
		
		SameClassStaticAccess s1 = new SameClassStaticAccess();
		
		System.out.println(s1.accessStatic+" from other class using object of static variable class");

	}

}
