package application;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// 예제 1
		System.out.println("메뉴");
		System.out.println("====");
		System.out.println("1. 프린트 '헬로우'");
		System.out.println("2. 프린트 '안녕?'");
		System.out.println("3. 프로그램 종료\n");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 1 ~ 3중 옵션을 선택> ");
		int opt = scanner.nextInt();
		scanner.close();
//		
//		if (opt == 1) {
//			System.out.println("안녕?");
//		}
//		else if (opt == 2) {
//			System.out.println("헬로우");
//		}
//		else if (opt == 3) {
//			System.out.println("종료합니다...");
//		}
//		else if (opt == 10000) {
//			System.out.println("이스터에그 발견!");
//		}
//		else {
//			System.out.println("잘못된 숫자입니다. 지정된 숫자를 입력해주세요.");
//		}
		
		
		// 같은 조건문을 switch문으로 만들었을 떄
		switch (opt) {
			case 1: 
				System.out.println("안녕?");
				break;
			case 2: 
				System.out.println("헬로우");
				break;
			case 3: 
				System.out.println("종료합니다...");
				break;
			case 10000: 
				System.out.println("이스터에그 발견!");
				break;
			default:
				System.out.println("잘못된 숫자입니다. 지정된 숫자를 입력해주세요.");
		}
		
	}

}
