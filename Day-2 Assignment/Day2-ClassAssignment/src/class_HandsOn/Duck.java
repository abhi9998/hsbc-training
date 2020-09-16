package class_HandsOn;

public class Duck {
	
	static {
		System.out.println("hiii");
	}

	static int duckCount = 0;
	
	public Duck() {
		duckCount++;
	}
	
	public static String getDuckBreed() {
		return "Marsh Duck";
	}
}
