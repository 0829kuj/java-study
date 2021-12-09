package application;

import java.util.Scanner;

public class CheckPassLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String USER_PASSWORD = "hello";
		
		Scanner scanner = new Scanner(System.in);		
		boolean accessOK = false;	//플래그 : boolean변수로 상태에 따라 처리
		
		for(int count = 0; count < 3; count++) {
			System.out.println("패스워드 입력 > ");
			String password = scanner.nextLine();
			
			if (password.equals(USER_PASSWORD)) {
				accessOK = true;
				System.out.println("접속허용");
				break;
			}
			else {
				System.out.printf("패스워드가 %d번 틀렸습니다. \n", count + 1);
			}
		}
			
		scanner.close();
		
		if(!accessOK) {		// !accessOK의 값이 true이면 "접속거부"출력
			System.out.println("접속거부");
		}

	}

}
