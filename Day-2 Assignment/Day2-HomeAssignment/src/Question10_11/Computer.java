package Question10_11;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */

public class Computer {

	private Mouse mouse;
	private Keyboard keyboard;
	private Cpu cpu;
	private Monitor monitor;
	/**
	 * Assembles computer with mouse,monitor,keyboard,cpu
	 * @param mouse
	 * @param keyboard
	 * @param cpu
	 * @param monitor
	 */
	public Computer(Mouse mouse, Keyboard keyboard, Cpu cpu, Monitor monitor) {
	
		this.mouse = mouse;
		this.keyboard = keyboard;
		this.cpu = cpu;
		this.monitor = monitor;
	}
	
	public String getMonitorDetails() {
		return "Size "+monitor.getDisplay()+" Rs"+monitor.getPrice();
	}
	
	public String getKeyboardDetails() {
		return "Color "+keyboard.getColor()+" Rs"+keyboard.getPrice();
	}
	
	public String getCpuDetails() {
		return "Frequency "+cpu.getFrequency()+"Hz Rs"+cpu.getPrice();
	}
	
	public String getMouseDetails() {
		return "Is wired "+mouse.isWired()+" Rs"+mouse.getPrice();
	}
	
	public int getTotalCost() {
		return mouse.getPrice()+keyboard.getPrice()+monitor.getPrice()+cpu.getPrice();
	}
}
