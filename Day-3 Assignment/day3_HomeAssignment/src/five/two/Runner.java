package five.two;

import five.one.AccessSpecifier;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessSpecifier a = new AccessSpecifier();
		//not allowed to access protected if uncommented
		//System.out.println("call to"+a.w);
		
		//not allowed to access private if uncommented
		//System.out.println("call to"+a.x);
		
		//public allowed
		System.out.println("call to "+a.y);
		
		// default not allowed if uncommented
		//System.out.println("call to"+a.z);

	}

}
