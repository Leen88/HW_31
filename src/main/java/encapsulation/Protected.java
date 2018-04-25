package encapsulation;

public class Protected {
	
	private static String p_name;
	public static String getName() {return p_name;}
	
	public static void setName(String name) {
		if (name != null && name.length() >= 3 && name.length() <= 12) {
			p_name = name;
		}
	}
}