
public class Runner {

	public static void main(String[] args) {
		System.out.println(Matching("Hello"));
		System.out.println(CompareStrings ("Hello there!", "Helloooooo"));
	}
	
	public static boolean Matching(String toCheck) {
		String message = "Hello World";
		
		if (toCheck.equals(message)) {
			return true; 
			
		} else {
			return false;
		}
	}

	public static boolean CompareStrings (String message1, String message2) {
		if (message1.equals(message2)) {
		return true;
	} else {
		return false; 
		
	}
}
}
