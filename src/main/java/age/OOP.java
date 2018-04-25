package age;

import java.text.*;
import java.util.Date;

public class OOP {                                               // Object-Oriented Programming
	String name = "Alex Moore";                                 // Instance Variable
	String dob = "01/14/1970";                                  // Instance Variable
	void print(String param) {System.out.println(param);}     // Instance Void Method
	
	long age(String param_dob) throws ParseException {       // Instance Method
		SimpleDateFormat f = new SimpleDateFormat("MM/dd/yyyy"); // Defining date format
		Date date = f.parse(param_dob);                     // Convert String to Date
		long dob_ms = date.getTime();                        // Local Variable (DOB in ms)
		long now_ms = System.currentTimeMillis(); // Local Variable (Current Time in ms)
		return (now_ms - dob_ms) / 31_556_952_000L;         // Returns age
	}                                                            // Instance Method
	
	public static void main(String[] args) throws ParseException { // Main Method
		// Type: OOP | Object Name: o | new Operator: new | Constructor: OOP()
		OOP o = new OOP();                                    // Object instantiation
		o.print("Name: " + o.name + "; Age: " + o.age(o.dob)); // Print name and age
	}                                                             // Main Method
}                                                                   // Class