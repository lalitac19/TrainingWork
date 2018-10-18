

public class LambdaRunner {
	public static void main (String[] args) {
		Consumer print2 = (String message) -> System.out.println(message);
		print2.print("Hello World!");
		
	}
	
	interface Consumer {
		void print(String message);
		
	}
	
}