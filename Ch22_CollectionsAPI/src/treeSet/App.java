package treeSet;

import java.util.TreeSet;

class Person implements Comparable<Person>{
	private String name;

	public Person(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
	
	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);	
		// ㄴ name을 문자열로 비교(이미 문자열에 비교메소드 compareTo가 구현되어 있음)
	}	
}

public class App {
	public static void main(String[] args) {
		// TreeSet은 정렬기능이 추가됨, 비교가능한 경우여야 함(없으면 구현필요)
		// 반드시 Comparable 인터페이스를 구현한 클래스 객체 입력
		TreeSet<Person> people = new TreeSet<>();
		people.add(new Person("펭수"));
		people.add(new Person("라이언"));
		people.add(new Person("가가멜"));
		people.add(new Person("스머프"));
		
		for(Person p : people) {
			System.out.println(p);
		}
		TreeSet<Integer> list = new TreeSet<>();
		list.add(10);
		list.add(7);
		list.add(9);
		list.add(1);
		for(Integer i : list) {
			System.out.println(i);
		}
		
	}
}
