package integerVariable;

public class Arithmetic {
	public static void main(String[] args) {
		System.out.println(7 + 3);
		System.out.println(9 / 3);
		
		System.out.println(10 / 3);		// 정수/정수 = 정수
		
		System.out.println(10.0 / 3.0);
		System.out.println(9/4.0);		// 정수/실수 = 이때 값이 큰 타입우선 (실수)
		System.out.println(4*3);
		System.out.println(3*4.0);		// 실수로 결과출력
		System.out.println(3-4);
	}
}
