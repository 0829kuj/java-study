package aplication;

import java.util.Scanner;

public class CheckPassword {
	public static void main(String[] args) {
		//지정된 패스워드 입력시 '접속승인' 아니면 '접속불가'
		final String USER_PASSWORD = "hello";
		
		System.out.println("비번을 입력>");
		
		Scanner scanner = new Scanner(System.in);
		
		String password = scanner.nextLine();//문자열 입력시
		scanner.close();
		
		if(password.equals(USER_PASSWORD)) {
			System.out.println("접속승인");
		}else {
			System.out.println("접속불가");
		}
	}

}
