package operators;

public class AND_OR {
	public static void main(String[] args) {
		// 비트 and(&), or(|) 연산
		int v1 = 0b01010011;
		int v2 = 0b11010110;
		// &&과 ||는 논리연산이라 비트연산대신 사용시 에러발생
		int result1 = v1 & v2;	// and 비트연산: 둘 다 1이면 1을, 나머진 0을 반환
		
		System.out.println(toBinary(v1));
		System.out.println(toBinary(v2));
		System.out.println(toBinary(result1));
		System.out.println("10진수: " + result1);
		
		System.out.println();
		
		int result2 = v1 | v2;	// or 비트연산: 둘 중 하나라도 1이면 1을, 나머지는 0을 반환
		System.out.println(toBinary(result2));
		System.out.println("10진수: " + result2);
	}
	
	public static String toBinary(int value) {	// 2진수 문자열로 출력하는 메소드
		// String.format : printf처럼 사용하면 문자열로 리턴됨
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
							// "%8s": 8자리 공간할당, replace(" ", "0") : 공백인 경우 0으로 채운다
	}
}
