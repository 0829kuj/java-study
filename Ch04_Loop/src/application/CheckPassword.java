package application;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		// 지정된 패스워드 입력 시 접속승인
		final String USER_PASSWORD = "hello";
		System.out.print("패스워드 입력 > ");
		
		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();
		scanner.close();
		
		if (password.equals(USER_PASSWORD)) {	// ==연산자 대신 equals메소드를 이용해 password와 USER_PASSWORD를 비교
			System.out.println("접속승인");
		}
		else {
			System.out.println("접속불가");
		}

	}

}
