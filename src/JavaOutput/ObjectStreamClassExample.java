package JavaOutput;

import java.io.ObjectStreamClass;

public class ObjectStreamClassExample {
	public static void main(String[] args) {
		
		
		//create a new object stream class for Calendar
		ObjectStreamClass osc2 = ObjectStreamClass.lookup(String.class);
		
		//get the Class instance for osc2
		System.out.println("" + osc2.getField("hash"));
	}
}
