package Question12;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class GetCity {
	static String cityName[]= {"DELHI","NOIDA","GUARGOAN","BANGLORE"};
	
	public static void main(String[] args) {
		
		System.out.println(getCityByCode(1));
	}
	public static String getCityByCode(int x) {
		
		if(x>4 ||x<=0) {
			return "INVALIDCODE";
		}else {
			return cityName[x-1];
		}
	}
	

}
