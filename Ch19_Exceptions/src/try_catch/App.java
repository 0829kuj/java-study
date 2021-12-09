package try_catch;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// 예외를 처리하는 try-catch 문
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		String line = scanner.nextLine();	// 문자열로 입력받음
		scanner.close(); 	// 스캐너 종료
		
		int number = 0;
		boolean isNumber = false;
		
		try {		// 예외가 발생 할 수 있는 코드를 작성
			number = Integer.parseInt(line);
			// Integer : int의 객체형, parseInt() : 문자열을 정수형으로 변환 (parseDouble, parseFloot 등도 존재함)
			isNumber = true;	// 숫자이면 true로 변경
		} catch (NumberFormatException e) {		// 예외 발생 시 프로그램 종료가 아니라 여기로 이동함
		// ㄴ (예외클래스명 변수)
			System.out.println("정수로 변활할 수 없습니다.");
		}
		if (isNumber) {
			System.out.println("입력한 숫자는 : " + number);
		}		

	}

}
