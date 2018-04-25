package core;

import java.io.*;
import java.util.Arrays;

public class Input_Console_Password {
	public static void main(String[] args) {

		Console c = System.console();

		if (c == null) {
			System.err.println("Console is not available");
			System.exit(0);
		}

		char[] password = c.readPassword("Password: ");
		char[] password2 = c.readPassword("Confirm Password: ");
		boolean isMatch = Arrays.equals(password, password2);
		System.out.println(isMatch ? "Passwords match" : "Passwords don't match");
		System.out.println("Password: " + String.valueOf(password));
		System.out.println("Confirm Password: " + String.valueOf(password2));
	}
}
