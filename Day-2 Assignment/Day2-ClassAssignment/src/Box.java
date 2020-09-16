
public class Box {

	private int length;
	private int breadth;
	private int height;
	private String color="No set";
	

	private double weight =0;
	
	public Box(int length,int breadth,int height) {
		this.length=length;
		this.breadth=breadth;
		this.height=height;
		
	}
	
	public Box(int length) {
		this(length,length,length);
	}
	
	public Box(int length,int breadth,int height,String color) {
		this(length,breadth,height);
		this.color=color;
	}
	public Box(int length,int breadth,int height,String color,double weight) {
		this(length,breadth,height,color);
		this.weight=weight;
	}
	
	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}

	public int getHeight() {
		return height;
	}

	public void getVolume(){
		System.out.println( "Volume is :"+(this.length*this.breadth*this.height));
		
	}
	
	public void getColor() {
		System.out.println("Color is :"+this.color);
	}
	
	public void getWeight() {
		System.out.println("Weight is :"+this.weight);
	}
	
	
}
