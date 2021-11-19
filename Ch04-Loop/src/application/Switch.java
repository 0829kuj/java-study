package application;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// Switch문
		int option = 0;
		
		switch(option) {
		case 0:		// 옵션변수가 케이스 0과 같을때
			System.out.println("옵션에서 0 선택");
			System.out.println("케이스 0 일때");
			break;	// 항상 케이스 하나 끝에 break 작성
		case 1:		// 옵션변수가 케이스 1과 같을때
			System.out.println("옵션에서 1 선택");
			break;	// 항상 케이스 하나 끝에 break 작성
		case 10:		// 옵션변수가 케이스 10과 같을때
			System.out.println("프로그램 종료...");
			break;	// 항상 케이스 하나 끝에 break 작성
		default:	// else와 같음. 위의 케이스에 맞는 것이 없을때 실행
			System.out.println("잘못된 옵션번호입니다");
			break;
		}
		

	}

}
