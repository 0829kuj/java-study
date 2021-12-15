package steam_example;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(6);
		numbers.add(2);
		numbers.add(4);
		numbers.add(7);
		
		numbers.forEach(System.out::println);
		System.out.println();
		numbers.stream() 	// numbers 객체에 stream을 생성하여 filter, forEach문을 사용
			.filter(n -> n > 5)
			.map(n -> n * n) 
			.forEach(n -> System.out.println(n));
	}

}
