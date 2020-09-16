package class_HandsOn;

public class MainDuck {
	static {
		System.out.println("hii from main static ");
	}

	public void fun() {
		System.out.println("not having fun");
	}
	public static void main(String[] args) {
		System.out.println("hii from main");
		Duck d1 = new Duck();
		Duck d2 = new Duck();
		Duck d3 = new Duck();
		Duck d4 = new Duck();

	//	System.out.println(Duck.duckCount);
	//	System.out.println(Duck.getDuckBreed());
	}

}
