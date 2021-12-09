package application;

public class StringEqual {

	public static void main(String[] args) {
		// 두 개의 문자열이 같은지 비교한다
		String t1 = "사과";
		String t2 = "오렌지";
		
		// 문자열을 비교하는 두 가지 방법
		System.out.printf("두 개의 문자열 일치 : %b \n", t1 == t2);	// 연산자로 비교, %b : boolean 타입
		System.out.printf("두 개의 문자열 일치 : %b \n", t1.equals(t2));	// 문자열의 equals메소드를 통해 비교, 같으면 true 다르면 false

	}

}
