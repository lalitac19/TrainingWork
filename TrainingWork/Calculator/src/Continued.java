
public class Continued {

	public static void main(String[] args) {
		int num1 = 23;
		int num2 = 7;
		
		System.out.println(AritmeticOperation(num1, num2, "*"));
	}
	
	public static int AritmeticOperation (int num1, int num2, String sign) {
		if (sign.equals("+")) {
			return num1 + num2; 
	} else if (sign.equals("-")) {
		return num1 - num2;
	} else if (sign.equals("*")) {
		return num1 * num2;
	} else if (sign.equals("/")) {
		return num1 / num2;
	} else {
		return 0; 
	}
	}
	
}
