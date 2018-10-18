
public class LambdaRunner {
	
	public static void main (String[] args) {
		CheckStrings myMessage = (String m, String m2) -> m.equals(m2);
				System.out.println(myMessage.checking("Hello", "Hello World!")); 
	}
	public interface CheckStrings {
		boolean checking(String m1, String m2);
	}
	
}
