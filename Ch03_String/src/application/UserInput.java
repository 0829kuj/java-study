package application;

import java.util.Scanner;	//java.util 패키지 안에 Scsnner 클래스를 불러와서 사용가능

public class UserInput {

	public static void main(String[] args) {
		// 입력을 받는 클래스
		Scanner scanner = new Scanner(System.in);	//스캐너 객체를 선언
		System.out.print("섭씨온도를 입력해주세요 : ");
		
		double c = scanner.nextDouble();	//스캐너로 정수를 입력받아 변수 c에 저장, 실행 시 입력을 대기하고 엔터키가 입력되면 종료
		double f = (c * 9/5) + 32;
		scanner.close();
		
		System.out.printf("섭씨 %.1f 는 화씨 %.1f 이다.", c, f);
	}
}
