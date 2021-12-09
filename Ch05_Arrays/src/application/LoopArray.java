package application;

public class LoopArray {

	public static void main(String[] args) {
		// 문자열 타입으로 만든 배열
		String[] animals = {"고양이", "개", "펭귄", "사자", "돌고래", "호랑이", "소"};
		
//		System.out.println(animals[0]);
//		System.out.println(animals[1]);
//		System.out.println(animals[2]);
//		System.out.println(animals[3]);
		
		// 반복문 for문 인덱스 번호를 i로, 배열명.length는 배열의 크기를 알려준다. 크기와 인덱스는 시작값이 다르니 주의.
		for (int i = 0; i < animals.length; i++) {
			System.out.printf("배열 animals의 인덱스 %d번의 값은 %s이다. \n", i, animals[i]);
			// %s : String 타입의 자리임을 나타냄
		}
		
		
	}

}
