
public class Runner {
	public static void main(String[] args) {
		
		int num1 = 23;
		int num2 = 7;
		
		System.out.println(Addition(num1, num2));
		System.out.println(Subtraction(num1, num2));
		System.out.println(Multiplication(num1, num2));
		System.out.println(Division(num1, num2));
	}
	
	public static int Addition(int num1, int num2) {
		return num1 + num2;
		
	}
	public static int Subtraction(int num1, int num2) {
		return num1 - num2;
		
	}
	public static int Multiplication(int num1, int num2) {
		return num1 * num2;
		
	}
	public static int Division(int num1, int num2) {
		return num1 / num2;
		
	}
}
