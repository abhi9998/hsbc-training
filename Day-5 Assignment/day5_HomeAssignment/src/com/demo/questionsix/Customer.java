package com.demo.questionsix;

import java.io.Serializable;
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */

public class Customer implements Serializable {

		private int customertId;
		private String name;
		private String address;
		
		public Customer() {
			
		}
		
		public Customer(int customerId, String name, String address) {
			this.customertId = customerId;
			this.name = name;
			this.address = address;
		}

		public int getCustomertId() {
			return customertId;
		}

		public void setCustomertId(int customertId) {
			this.customertId = customertId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		
		
}
