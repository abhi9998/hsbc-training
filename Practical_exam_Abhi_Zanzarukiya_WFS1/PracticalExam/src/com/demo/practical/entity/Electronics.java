package com.demo.practical.entity;
/**
 * This is the class of electronics type
 * @author Abhi Zanzarukiya
 *
 */
public class Electronics extends Product {

	private int warrenty;
	
	public Electronics() {
		
	}
	public Electronics(int itemCode, String itemName, double unitPrice, int warrenty, int quantity) {
		super(itemCode,itemName,unitPrice,quantity);
		this.warrenty=warrenty;
	}
	public int getWarrenty() {
		return warrenty;
	}
	public void setWarrenty(int warrenty) {
		this.warrenty = warrenty;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Electronics e = (Electronics) obj;
		if(e.getItemCode() == this.getItemCode()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		
		return this.getItemCode(); 
	}
}
