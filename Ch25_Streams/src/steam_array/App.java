package steam_array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {
	public static void main(String[] args) {
		// 배열과 스트림
		// 리스트일 경우: .stream()
		// 리스트가 아닐경우 1. stream.of(1,2,3) - 정수형스트림  Stream.of("하나","둘","셋") - 문자열스트림
		//			   2. 배열일 경우 Array.stream(배열입력)
		
		Stream.of("Hello", "bottle", "Afria")
			.sorted()		// 정렬: 알파벳순
			.findFirst()	// 첫번째만 선택
			.ifPresent(x -> System.out.println(x));	// 값이 있을 경우 출력하라(값이 없어도 에러x)

		String[] items = {"치킨", "원숭이", "고릴라", "치약", "고라니", "치과", "고양이"};
		Stream.of(items)	// 배열을 입력해서 스트림 생성
			.filter(s -> s.startsWith("치"))	// filter: true인 값만 남기고 false시 제거
			.forEach(x -> System.out.printf("%s,  ", x));
		
		System.out.println();
		
		// 정수배열 스트림
		int[] numbers = {2,4,6,8,10};
		Arrays.stream(numbers)		// 배열스트림에 정수배열
			.map(n -> n*n)	// 제곱
			.average()		// 평균, 최대값 max(), 최소값 min()
			.ifPresent(n -> System.out.println(n));
		
		System.out.println();
		
		// 배열을 리스트로
		List<String> listItems = Arrays.asList(items);
		listItems.stream()
			.filter(x -> x.startsWith("고"))	// 고릴라 고라니 고양이
			.sorted()						// 고라니 고릴라 고양이 (정렬)
			.forEach(x -> System.out.printf("%s,\t", x));
		
		System.out.println();
		int[] nums = {9, 4, 6, 3, 1, 2, 7};
		Arrays.stream(nums)
			.filter(n -> n > 3)	// 3보다 큰 9 4 6 7만 남음
			.sorted()			// 4 6 7 9
			.map(s -> s * 10)	// 40 60 70 90
			.forEach(n -> System.out.printf("%s, ", n));
		
		System.out.printf("\n\n");
		
		// Array.asList(배열) => 리스트로
		List<String> names = Arrays.asList("Eric","Elena", "java");
		names.stream()
			.filter(name -> name.contains("a"))
			.map(String::toUpperCase)
			.forEach(n -> System.out.printf("%s, ", n));
		
		System.out.println();
		
		List<Integer> numbers2 = Arrays.asList(9,4,6,3,1,2,7);
		numbers2.stream()
				.filter(n -> n > 3)
				.sorted()
				.map(s -> s * 5)
				.forEach(n -> System.out.printf("%s, ", n));
	}
}
