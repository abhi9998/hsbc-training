// program to greet the message to 10 person
/**
 * 
 * @author Abhi Zanzarukiya
 *
 */
public class GreetMessage {
	/**
	 * This program greets 10 people with their names.
	 * @param args
	 * @see Array
	 */
public static void main(String[] args) {
	
	String peopleName[] = {"Abhi","Mayank","Rutvik","Bhargav","Gautum","Rahul","Mohan","Ram","Jeel","Jeet"};
	
	
	for(int i=0;i<10;i++) {
		System.out.println("Greetings "+peopleName[i]+"!");
	}
}
}
