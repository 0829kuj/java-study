package operators;

public class SHIFT {
	public static void main(String[] args) {
		// 비트 shift >>, << 연산
		int value = 0b00010001;
		System.out.println("10진수: " + value);
		System.out.println("2진수: " + toBinary(value));
		
		int result1 = value << 3;
		System.out.println(toBinary(result1));
		
		int result2 = value >> 3;
		System.out.println(toBinary(result2));
		
		System.out.println("100 << 2 = " + (100 << 3));	// <<: 2의 n제곱만큼 곱함 => 2의3제곱 = 곱하기 6
		System.out.println("100 >> 1 = " + (100 >> 1));	// >>: 2의 n제곱만큼 나눔 => 2의1제곱 = 나누기 2
		
		
	}
	
	public static String toBinary(int value) {	// 2진수 문자열로 출력하는 메소드
		// String.format : printf처럼 사용하면 문자열로 리턴됨
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
							// "%8s": 8자리 공간할당, replace(" ", "0") : 공백인 경우 0으로 채운다
	}
}
