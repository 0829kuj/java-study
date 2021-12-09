package application;

public class StringArray {

	public static void main(String[] args) {
		// 문자열 타입으로 만든 배열
		String[] animals = {"고양이", "개", "펭귄", "사자"};
		
		System.out.println(animals[0]);
		System.out.println(animals[1]);
		System.out.println(animals[2]);
		System.out.println(animals[3]);
		
		animals[0] = "닭";	// 0번 인덱스의 값을 "닭"으로 재정의
		
		System.out.println(animals[0]);		//값을 재정의해도 문제없이 새로운 값이 출력됨
		System.out.println(animals[1]);
		System.out.println(animals[2]);
		System.out.println(animals[3]);
	}

}
