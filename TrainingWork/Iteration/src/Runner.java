
public class Runner {
	public static void main(String[] args) {
		PrintingToTen();
		PrintingToNineNineNine();
		PrintingToThousandWords();
		PrintingToTenWords();
		PrintingToHundredWords(); 
	}
	
	public static void PrintingToTen () {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public static void PrintingToNineNineNine () {
		for (int i = 100; i < 1000; i++) {
			System.out.println(i);
		}
	}
	
	public static void PrintingToTenWords() {
		for (int i = 1; i <= 10; i++) {
			switch (i) {
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3: 
				System.out.println("Three");
				break;
			case 4: 
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7: 
				System.out.println("Seven");
				break;
			case 8: 
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
			case 10:
				System.out.println("Ten");
				break;
			}
		}
	}
	
	public static void PrintingToHundredWords() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(convert(i));
		}
	}
	public static void PrintingToThousandWords() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println(convert(i));
		}
	}

		public static String convert(Integer i) {
			final String[] units = {"Zero","One","Two","Three","Four",
					"Five","Six","Seven","Eight","Nine","Ten",
					"Eleven","Twelve","Thirteen","Fourteen","Fifteen",
					"Sixteen","Seventeen","Eighteen","Nineteen"};
			
			final String[] tens = {"","","Twenty","Thirty","Forty","Fifty",
					"Sixty","Seventy","Eighty","Ninety"};
			if( i < 20)  {
				return units[i];
			}
			if( i < 100) {
				return tens[i/10] + ((i % 10 > 0)? " " + convert(i % 10):"");
			}
			if( i < 1000) {
				return units[i/100] + " Hundred" + ((i % 100 > 0)?" and " + convert(i % 100):"");
			}
			else {
				return "0";
			}
		}
}
