package core;

import java.math.*;

public class CLA_M_Add {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.err.println("At least 2 params");
			System.exit(0);
		}
		Double result = 0.0;// Double.valueOf(args[0]);
		System.out.println("arg one is: " + args[0]);
		System.out.println("arg two is: " + args[1]);
		
		for (int i = 0; i < args.length; i++) {
			result += Double.valueOf(args[i]);
			System.out.println("result is: " + Double.valueOf(args[i]));
		}
		System.out.println(new BigDecimal(result).setScale(2, RoundingMode.HALF_UP));
	}
}
    	