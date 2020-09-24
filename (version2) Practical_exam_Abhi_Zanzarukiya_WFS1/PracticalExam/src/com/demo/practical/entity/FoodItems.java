package com.demo.practical.entity;
/**
 * This is the class of foodItems
 * @author Abhi Zanzarukiya
 *
 */
public class FoodItems extends Product {
	
	private String dateOfManufacture;
	private String dateOfExpiry;
	private String vegeterian;
	
	public FoodItems() {
		
	}
	
	public FoodItems(int itemCode, String itemName, double unitPrice, String dateOfManufacture,String dateOfExpiry, String vegeterian, int quantity) {
		super(itemCode,itemName,unitPrice,quantity);
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry=dateOfExpiry;
		this.vegeterian=vegeterian;
				
		
	}

	public String getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(String dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public String isVegeterian() {
		return vegeterian;
	}

	public void setVegeterian(String vegeterian) {
		this.vegeterian = vegeterian;
	}
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		FoodItems f = (FoodItems) arg0;
		if(f.getItemCode()==this.getItemCode()) {
			return true;
		}else {
			return false;
		}
	 
	}
	
	 @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getItemCode();
	}
	
}
