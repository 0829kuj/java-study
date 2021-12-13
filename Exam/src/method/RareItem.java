package method;

import java.util.Scanner;

public class RareItem {
	/*
	체력과 마력이 동시에 동시에 2000이어야만 착용가능한 아이템이 있다
	체력과 마력을 입력하여 작용결과를 출력하는 메소드 wear()를 완성하고 출력하시오
	*/
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("hp를 입력해주세요: ");
		int hp = scanner.nextInt();
		System.out.printf("mp를 입력해주세요: ");
		int mp = scanner.nextInt();
		
		wear(hp, mp);
		scanner.close();
	}

	private static void wear(int hp, int mp) {
		// 체력과 마력이 동시에 2000이 넘는지 체크하여 결과를 리턴하는 메소드
		if(hp >= 2000 && mp >= 2000) 
			System.out.println("아이템 장착 완료!");
		else
			System.out.println("아이템을 장착할 수 없습니다...");

	}
}
