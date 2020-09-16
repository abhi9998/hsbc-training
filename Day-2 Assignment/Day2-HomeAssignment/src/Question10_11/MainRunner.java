package Question10_11;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mouse mouse = new Mouse(100,true);
		Keyboard keyboard = new Keyboard(1000,"Black");
		Monitor monitor = new Monitor(10000,15);
		Cpu cpu =new Cpu(1000,15000);
		
		Computer computer1 = new Computer(mouse,keyboard,cpu,monitor);
		
		System.out.println("Total price of computer is "+computer1.getTotalCost());
	}

}
