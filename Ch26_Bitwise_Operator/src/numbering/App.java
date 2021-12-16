package numbering;

public class App {

	public static void main(String[] args) {
		/*
		 * 10진수 	deciaml 	0-9
		 * 2진수		binary	 	0-1 (컴퓨터)
		 * 16진수 	hexadecimal 0-F
		 *
		 * 123456789 => 10진수
		 * 0, 1, 10, 11, 100, 1000 => 2진수
		 * A0, FB, CD, FFFF, FF00 => 16진수
		 * 
		 * 8bit = 1byte
		 * 
		 * 1byte로 표현할수 있는 최대숫자 (0부터 시작)
		 * 2진수는 1bit => 11111111
		 * 10진수 => 255
		 * 16진수는 4bit 표현가능 => ff 까지 표현가능
		 */
		
		int value = 123;
		
		System.out.println("10진수: " + value);
		System.out.println("2진수: " + Integer.toBinaryString(value)); // 10진수 정수를 문자열 2진수로 변환
		System.out.println("16진수: " + Integer.toHexString(123));	// 10진수 정수를 문자열 16진수로 변환
		
		System.out.println();
		
		// 16진수 리터럴(값) 표시할때는 0x 를, 2진수는 0b를 먼저 붙임
		int value2 = 0xFF;	// 0x는 16진수임을 알려주는것. FF가 값임.
		
		System.out.println("10진수: " + value2);
		System.out.println("2진수: " + Integer.toBinaryString(value2));
		System.out.printf("16진수: %s", Integer.toHexString(value2));
		
		int value3 = 0b1111;
		
		System.out.println("10진수: " + value3);
		System.out.println("2진수: " + Integer.toBinaryString(value3));
		System.out.printf("16진수: %s", Integer.toHexString(value3));
		

	}

}
