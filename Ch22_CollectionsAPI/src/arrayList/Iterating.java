package arrayList;

import java.util.ArrayList;

public class Iterating {

	public static void main(String[] args) {
		// 리스트 : 좀 더 사용하기 좋은 배열의 개념
		ArrayList<Integer> list = new ArrayList<>();	// 정수타입 리스트 생성
		// 리스트에 정수 추가
		list.add(7);
		list.add(9);
		list.add(123);
		// get(인덱스번호)로 리턴
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
	}

}
