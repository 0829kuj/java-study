package lamda_interface;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.UnaryOperator;

public class ReplaceAll {
	public static void main(String[] args) {
		// ReplaceAll : 각각의 값을 리턴된 값으로 바꿔줌
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(7);
		numbers.add(2);
		
		numbers.forEach(n -> System.out.print(n + "\t"));
		System.out.printf("\n\n");
//		numbers.replaceAll(new UnaryOperator<Integer> (){
//			public Integer apply(Integer n) {
//				return n * n;
//			}
//		});
		// 20~24행을 람다식으로 바꿔 줄임
		numbers.replaceAll(n -> n * n);
		numbers.forEach(n -> System.out.printf(n + "\t"));
		System.out.println();
		
		// 문자열의 경우
		List<String> friends = new ArrayList<>();
		friends.add("길동");
		friends.add("메리");
		friends.add("철수");
		friends.add("영식");
		friends.forEach(s -> System.out.println(s));
		friends.replaceAll(s -> "안녕~ " + s);
		friends.forEach(s -> System.out.println(s));
	}
}
