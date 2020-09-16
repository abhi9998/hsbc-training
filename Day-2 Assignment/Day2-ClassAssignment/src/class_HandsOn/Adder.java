package class_HandsOn;

public class Adder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length<2) {
			System.out.println("Minimum 2 values are required");
			
		}
		
		int answer = 0;
		
		for(int i=0;i<args.length;i++) {
			answer+=Integer.parseInt(args[i]);
		}
		
		System.out.println("Sum of all input numbers is : "+answer);

	}

}
