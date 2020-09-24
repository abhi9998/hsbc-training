package com.demo.practical.entity;
/**
 * This is the class of Product which is super class
 * @author Abhi Zanzarukiya
 *
 */
public class Product {

	private int itemCode;
	private String itemName;
	private double unitPrice;
	private int quantity;
	
	public Product(){
		
	}
	
	public Product(int itemCode, String itemName, double unitPrice, int quantity) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
