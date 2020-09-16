package Question5;
/***
 * 
 * @author Abhi Zanzarukiya
 *
 */

public class Person {
	
	private String name;
	private String city;
	private int age;
	public Person(String name, int age, String city) {
		this.name= name;
		this.city=city;
		this.age= age;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public int getAge() {
		return age;
	}
}
