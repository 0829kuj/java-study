package application;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// If 조건문 : if(조건문){조건이 맞으면 실행될 소스코드}
		Scanner scanner = new Scanner(System.in);
		System.out.println("사과의 갯수: ");
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("바나나의 갯수: ");
		
		int apple = scanner.nextInt();
		int banana = scanner2.nextInt();
		scanner.close();	// 스캐너 종료(더 이상 사용안할때)
		
		if (apple > banana) {
			System.out.println(apple + "이 "+ banana + "보다 많다.");
		}
		if (apple < banana) {
			System.out.println(banana + "가(이) "+ apple + "보다 많다.");
		}
		if (apple == banana) {
			System.out.println(apple + "과 " + banana + "의 수가 같다.");
		}
		System.out.println("프로그램 종료");
	}

}
