package example;

import java.util.ArrayList;
import java.util.List;

public class App3 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(6);
		numbers.add(4);
		numbers.add(7);
		numbers.add(3);
		numbers.add(6);
		numbers.add(3);
		
//		numbers.removeIf(n -> n<5);
		numbers.removeIf(App3::filter);	// 위의 람다식을 메소드 레퍼런스로 변경
		numbers.forEach(System.out::println);
		System.out.println();
//		numbers.replaceAll(n -> n *2);
		numbers.replaceAll(App3::map);	// 위의 람다식을 메소드 레퍼런스로 변경
		numbers.forEach(System.out::println);
		
	}
	private static boolean filter(int n) {
		return n < 5;
	}
	private static int map(int n) {	
		return n * 2; 
	}
	
}
