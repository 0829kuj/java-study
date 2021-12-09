package nullPointException;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// null point 예외는 RumtimeException으로 예외처리를 하지 않아도 된다
		
		// 런타임 예외 예
		// System.out.println(5/0);
		
		// null point예외 : 객체가 null값인데 사용할 경우
		Scanner scanner = null;	// 객체는 생성안함, 주소값이 없는 상태임
		scanner.nextInt();
	}

}
