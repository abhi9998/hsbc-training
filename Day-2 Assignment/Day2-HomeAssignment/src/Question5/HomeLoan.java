package Question5;
/***
 * 
 * @author Abhi Zanzarukiya
 *
 */

public class HomeLoan {
	private Person p;
	private int rateOfInterest;
	private int amount;
	private int months;
	/***
	 * HomeLoan class
	 * @param p
	 * @param rateOfInterest
	 * @param amount
	 * @param months
	 */
	public HomeLoan(Person p, int rateOfInterest, int amount, int months) {
		
		this.p = p;
		this.rateOfInterest = rateOfInterest;
		this.amount = amount;
		this.months = months;
	}

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

	public int getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(int rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getMonths() {
		return months;
	}

	public void setMonths(int months) {
		this.months = months;
	}
	
	public int interest() {
		return amount*rateOfInterest*months/1200;
	}
	
	public String getDetailsOfPerson() {
		
		return p.getName()+" "+p.getAge()+" "+p.getCity();
	}
	
	
	

}
