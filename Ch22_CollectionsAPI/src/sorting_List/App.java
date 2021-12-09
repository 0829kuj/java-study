package sorting_List;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		// 리스트를 정렬
		ArrayList<Double> doubles = new ArrayList<>();
		
		doubles.add(7.39);
		doubles.add(3.88);
		doubles.add(1.45);
		doubles.add(8.34);
		doubles.add(0.77);
		doubles.add(9.21);
		
		doubles.forEach(System.out::println);  // 정렬 전 출력
		Collections.sort(doubles); 		// 정렬
		doubles.forEach(System.out::println);	// 정렬 후 출력
		
		// 기본타입 숫자 등은 값으로 정렬, 문자열과 문자 등은 알파벳순, 한글은 가나다순으로 정렬
		
		// 커스텀 객체의 정렬 : 비교 코드를 따로 작성해주지 않으면 기준이 없어 정렬불가
		ArrayList<Person> people = new ArrayList<>();
		
		people.add(new Person("펭수"));
		people.add(new Person("둘리"));
		people.add(new Person("라이언"));
		people.add(new Person("길동"));
		
		Collections.sort(people);
		people.forEach(System.out::println);
	}

}
