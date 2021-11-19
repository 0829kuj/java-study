package aplication;

import java.util.Scanner;

public class switch2 {
	public static void main(String[] args) {
		//switch문 문자 입력
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("계속 진행하시겠습니까? (Y/N):");
		
		String input = scanner.nextLine();//문자열 입력시
		
		scanner.close();
		
		
		switch(input) {
		case "Y": 
			System.out.println("계속 진행합니다.");
			break; 
		case "N": 
			System.out.println("종료 합니다");
			break;
		default: //else와 같음 위의 케이스에 맞는 것이 없을때 실행
		System.out.println("잘못된 입력입니다.");
		break;
		}
	}

}
