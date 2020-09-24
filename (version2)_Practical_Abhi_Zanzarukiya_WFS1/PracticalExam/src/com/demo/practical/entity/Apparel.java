package com.demo.practical.entity;
/**
 * THis is the class of apparel type
 * @author Abhi Zanzarukiya
 *
 */
public class Apparel extends Product {
	
	private String size;
	private String material;
	
	public Apparel() {
		
	}
	
	public Apparel(int itemCode, String itemName, double unitPrice, String size, String material, int quantity) {
		
		super(itemCode,itemName,unitPrice,quantity);
		this.size=size;
		this.material=material;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	@Override
	public boolean equals(Object obj) {
		Apparel a = (Apparel)obj;
		if(a.getItemCode() == this.getItemCode() )
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getItemCode();
	}
	
	public String toString() {
		return super.getItemCode()+" "+super.getItemName()+" "+super.getUnitPrice()+" "+size+" "+material+" "+super.getQuantity()+"\n";
	}

}
