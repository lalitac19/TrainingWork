import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		//exercise 1
		int number1, number2; 
		System.out.println("Please input 2 numbers");
		Scanner stdIn = new Scanner (System.in);
		number1 = stdIn.nextInt();
		number2 = stdIn.nextInt();
		
		System.out.println(Addition(number1, number2));
		System.out.println(Subtraction(number1, number2));
		System.out.println(Multiplication(number1, number2));
		System.out.println(Division(number1, number2));
	}
	
	//exercise 1
	public static int Addition(int num1, int num2) {
		return num1 + num2;
	}
	
	//exercise 2
	public static int Subtraction(int num1, int num2) {
		return num1 - num2;
		
	}
	public static int Multiplication(int num1, int num2) {
		return num1 * num2;
		
	}
	//exercise 3 & 4
	public static double Division(double num1, double num2) {
		if (num1 > num2) {
		return num1 / num2;
		} else {
			System.out.println("Division cannot be performed");
			return 0.0; 
		}
		
	}
}
