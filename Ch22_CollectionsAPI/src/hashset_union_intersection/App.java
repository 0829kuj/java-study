package hashset_union_intersection;	// 합집합 union, 교집합 intersection

import java.util.HashSet;
import java.util.Objects;

public class App {
	public static void main(String[] args) {
		// set형은 데이터 중복x, 순서없음
		
		HashSet<String> list1 = new HashSet<>();
		list1.add("사과");
		list1.add("배");
		list1.add("딸기");
		list1.add("수박");

		HashSet<String> list2 = new HashSet<>();
		list2.add("체리");
		list2.add("배");
		list2.add("사과");
		list2.add("오렌지");

		HashSet<String> union = new HashSet<String>(list1);	// 처음 생성 시 list1을 입력해 생성
		union.addAll(list2);	// union에 list2를 모두 입력함 (중복아이템은 삭제)
		
		union.forEach(System.out::println);	// list1, list2의 합집합 union의 아이템을 모두 출력
		
		System.out.println();
		
		HashSet<String> intersection = new HashSet<String>(list1);
		intersection.retainAll(list2);	// list1와 list2의 중복 아이템들만 남김
		
		intersection.forEach(System.out::println);	// 교집합 intersection의 아이템을 모두 출력
		
		System.out.println();
		
		HashSet<String> minus = new HashSet<String>(list1);
		minus.remove(list2);	// list1에서 list2를 뺀다
		minus.forEach(System.out::println);	// 차집합 minus의 아이템 모두 출력
		
	}

}
