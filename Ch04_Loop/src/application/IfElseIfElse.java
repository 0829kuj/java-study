package application;

import java.util.Scanner;

public class IfElseIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("사과의 갯수: ");
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("바나나의 갯수: ");
		
		int apple = scanner.nextInt();
		int banana = scanner2.nextInt();
		scanner.close();	// 스캐너 종료(더 이상 사용안할때)
		
		if (apple > banana) {
			System.out.println("apple가(이) banana보다 많다.");
		}
		else if (apple < banana) {
			System.out.println("banana가(이) apple보다 많다.");
		}
		else {
			System.out.println("apple과 banana의 갯수가 같다.");
		}
		
		System.out.println("프로그램 종료");
	}

}
