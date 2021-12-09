package arrayList;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// 리스트 : 좀 더 사용하기 좋은 배열의 개념
		ArrayList<Integer> list = new ArrayList<>();	// 정수타입 리스트 생성
		// 리스트에 정수 추가
		list.add(7);
		list.add(9);
		list.add(123);
		
		// 반복문 사용 - for each문 : for문 보다 간단하지만 인덱스 번호 사용불가
		for(int n : list) {
			System.out.println(n);
		}
		System.out.println();
		// for 반복문	: 인덱스 번호가 필요할 때
		for(int i = 0; i < list.size(); i++) {
			Integer n = list.get(i);
			System.out.println("index번호 " + i + " : " + n);
		}
		// 컬렉션객체.forEach(각각 반복) => 람다식
		list.forEach(System.out::println);
		
		System.out.println("~~ 한 줄 띄우기 ~~");
		// 메소드레퍼런스
		list.forEach(e -> {
			System.out.println(e);
		});
		
	}

}
