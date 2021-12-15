package lamda_interface;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.Predicate;

public class RemoveIf {

	public static void main(String[] args) {
		// 특정 타입(제네릭)을 검사해서 참, 거짓을 리턴
		List<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(2);
		numbers.add(9);
		numbers.add(10);
		numbers.add(4);
		numbers.forEach(t -> System.out.print(t + "\t"));	// numbers의 원소를 차례로 모두 출력
		System.out.printf("\n\n");
		// 리스트 numbers 안에 있는 정수들 중 6보다 작으면 모두 제거
		// removeIf(매개변수 -> 조건) : predicate로 검사(test)해서 참이면 다 제거
//		numbers.removeIf(new Predicate<Integer>() {
//			public boolean test(Integer i) {
//				return i < 6;	// 정수가 6보다 작으면 참
//			}
//		});
		// 23~27행을 이렇게 간단히 표현가능
		numbers.removeIf(i -> i < 6);
		numbers.forEach(x -> System.out.println(x));	// numbers의 원소를 차례로 모두 출력
		System.out.println();
		
		List<String> sList = new ArrayList<>();
		sList.add("하나둘");
		sList.add("둘셋넷");
		sList.add("셋둘하나");
		sList.add("여섯일곱여덟");
		sList.add("다섯넷셋");
		sList.add("하나둘셋");
		
		// 문자열의 길이가 4보다 작으면 모두 제거
		sList.removeIf(s -> s.length() < 4);	// 문자열의 길이가 4보다 작으면 참. 참이면 제거
		sList.forEach(s -> System.out.println(s));	// sList 원소 모두 출력

	}

}
