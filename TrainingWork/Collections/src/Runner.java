import java.awt.List;
import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		OneToHundred();
		HundredToNineNineNine();
		Multiplier(HundredToNineNineNine());
	}
	
	public static void OneToHundred() {
		int [] number = new int [100]; 
		for (int x = 0; x <100; x ++) {
			number[x] = x+1;
		}
		for (int i : number ) {
			System.out.println(i);
		}
	}
	
	public static ArrayList<Integer> HundredToNineNineNine () {
		ArrayList <Integer> numbers = new ArrayList<>(); 
		for (int x = 100; x < 1000; x ++ ) {
			numbers.add(x);
		}
		for (int i : numbers ) {
			System.out.println(i);
		}
		return numbers; 
	}
	
	public static void Multiplier (ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i ++) {
			list.set(i, (list.get(i)*10));
		}
		for (int i : list ) {
			System.out.println(i);
		}
	}
	}


