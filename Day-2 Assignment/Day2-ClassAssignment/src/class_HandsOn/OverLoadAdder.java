package class_HandsOn;

public class OverLoadAdder {

	public void add() {
		
	}
//	public int add(int a,int b) {
//		System.out.println("int a + int b = "+(a+b));
//		return a+b;
//	}
	
//	public float add(int a, float b ) {
//		System.out.println("int a + float b = "+(a+b));
//		return a+b;
//		
//	}
	
	public double add(int a, double b ) {
		System.out.println("int a + double b = "+(a+b));
		return a+b;
		
	}
	
	public double add(double a, double b ) {
		System.out.println("double a + double b = "+(a+b));
		return a+b;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverLoadAdder adder = new OverLoadAdder();
		adder.add();
		adder.add(2, 3);
		adder.add(2,3.0f);
		adder.add(2,3.0);
		adder.add(2.0,3.0);

	}

}
