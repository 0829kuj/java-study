package example_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Person implements Comparable<Person> {
	// Person의 name으로 equals메소드를 만들어 key값의 중복제거
	private String name;

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}

	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);	// 이름으로 비교
	}
}

public class App {
	public static void main(String[] args) {
		// map을 사용한 예제
		Map<Person, Boolean> people1 = new HashMap<>();
		Map<Person, Boolean> people2 = new LinkedHashMap<>();
		Map<Person, Boolean> people3 = new TreeMap<>();
		
		// map에서 key값으로 중복을 결정할때 Person클래스에 equals메소드를 만들어 이름이 같으면 중복으로 간주하도록 수정
		inputMap(people1);
		displayMap(people1);	// HashMap
		inputMap(people2);
		displayMap(people2);	// LinkedHashMap : 입력된 순서대로 출력됨
		inputMap(people3);
		displayMap(people3);	// TreeMap : 정렬기준을 지정해줘야함 - Person클래스에서 Comparable구현필요
	}

	private static void displayMap(Map<Person, Boolean> map) {
		// map의 key와 value값을 출력
		map.forEach((k, v)->System.out.println(k + ": " + v));
		System.out.println();
	}

	private static void inputMap(Map<Person, Boolean> map) {
		// map에 person객체와 boolean을 입력(원격여부)
		map.put(new Person("펭수"), true);
		map.put(new Person("길동"), true);
		map.put(new Person("라이언"), false);
		map.put(new Person("둘리"), false);
		map.put(new Person("공순이"), false);
		map.put(new Person("라이언"), false);	// 같은 이름은 중복불가
		map.put(new Person("둘리"), true);	// 둘리의 value값 true로 업데이트
	}

}
