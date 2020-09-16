
public class MainBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box b1 = new Box(10,20,30);
		b1.getVolume();
		
		Box b2 = new Box(10,20,30,"Blue");
		b2.getColor();
		
		b1.getColor();
		
		Box b3 = new Box(10,20,30,"Blue",9.6);
		b3.getColor();
		b3.getWeight();
		
		Box cube = new Box(10);
		cube.getVolume();

	}

}
