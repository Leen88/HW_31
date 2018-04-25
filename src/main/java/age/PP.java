package age;

import java.text.*;

/*
System.currentTimeMillis() - Current time in milliseconds:
new SimpleDateFormat("MM/DD/YYYY").parse("01/14/1970").getTime() - DOB in milliseconds
31,556,952,000 - milliseconds in a years
*/
public class PP { // Procedural Programming

	public static void main(String[] args) throws ParseException { // Main Method

		System.out.print("Name: "); // Printing label: Name
		System.out.print("Alex Moore"); // Printing name
		System.out.print("; "); // Printing delimiter
		System.out.print("Age: "); // Printing label: Age
		System.out.print((System.currentTimeMillis() - new SimpleDateFormat("MM/dd/yyyy").parse("01/14/1970").getTime())
				/ 31_556_952_000L);
		// Printing Age
	} // Main Method
} // Class