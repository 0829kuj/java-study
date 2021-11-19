package application;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// do while은 while과 달리 처음 한 번은 조건과 상관없이 무조건 실행함
		/*
		int count = 100;
		
		System.out.println("do while 반복문");
		
		do {
			System.out.println("Count: " + count);
		}
		while (count++ < 5);	// count를 5와 비교한 후 count에 +1을 해줌, 조건이 false값이지만 do while문은 처음한번은 무조건 실행됨
		*/
		
		final String USER_PASSWORD = "hello";
		
		Scanner scanner = new Scanner(System.in);
		String password = "";	// 문자열의 선언과 최기값에 공백(null)을 줌
		
		do {
			System.out.print("비번을 입력 > ");
			password = scanner.nextLine();
		}
		// password.equal(USER_PASSWORD)이 false가 나오면 멈추게 만들어야 하므로 !연산자로 값을 반대로 만들어줌
		while (!password.equals(USER_PASSWORD));	// 이 조건식이 true가 나오면 계속 반복이 되어버림 
			scanner.close();
			System.out.println("접속승인");
	
			

	}
}
