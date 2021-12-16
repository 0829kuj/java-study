package operators;

public class XOR_NOT {
	public static void main(String[] args) {
		// 비트 xor, not 연산
		// xor(^) : 두 값이 같으면 0을, 다르면 1을 반환
		// not(~) : 0이면 1을, 1이면 0을 반환 
		
		int v1 = 0b01010011;
		int v2 = 0b11010110;
		
		int result1 = v1 ^ v2;	// xor 비트연산
		
		System.out.println(toBinary(v1));
		System.out.println(toBinary(v2));
		System.out.println(toBinary(result1));
		System.out.println("10진수: " + result1);
		System.out.println();
		
		// not연산: 1 -> 0, 0 -> 1
		System.out.println(toBinary(~result1));
		System.out.println("10진수: " + (~result1));
	}
	
	public static String toBinary(int value) {	// 2진수 문자열로 출력하는 메소드
		// String.format : printf처럼 사용하면 문자열로 리턴됨
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
							// "%8s": 8자리 공간할당, replace(" ", "0") : 공백인 경우 0으로 채운다
	}
}
