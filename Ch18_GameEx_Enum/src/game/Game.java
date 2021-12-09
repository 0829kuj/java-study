package game;

import java.util.Random;		// 랜덤클래스의 위치
import java.util.Scanner;
import game.objects.GameObject;

public class Game {
	// 사용할 가위, 바위, 보 객체를 배열로 생성
	GameObject[] objects = GameObject.values();		// enum의 상수들을 배열로 리턴
	Random random = new Random();	// 랜덤클래스 호출(랜덤클래스는 원래부터 존재하므로 호출만 하면됨)
	Scanner scanner = new Scanner(System.in);
	
	public void run() {
		System.out.println("삼세판 게임시작 ...");
		int wins = 0;
		
		for(int i = 1; i <= 3; i++) {		// i를 1부터 3까지 3번 반복
			System.out.println("가위(0), 바위(1), 보(2) 중 숫자로 하나를 선택 : ");
			
			// 질문! 아래처럼 넣었을때 왜 1, 2, 3중 하나를 랜덤선택하는게 아니라 0, 1, 2 중 하나를 고르지?
			// random으로 선택된 objects배열의 길이(여기선 3)에서 하나를 골라 []에 대입 
			GameObject ob1 = objects[scanner.nextInt()];
			GameObject ob2 = objects[random.nextInt(objects.length)];
	
			System.out.println("당신의 선택은 : " + ob1);
			System.out.println("컴퓨터의 선택은 : " + ob2);


			int result = ob1.compare(ob2);		// ob1의 compare메소드를 불러 ob2와 비교한 결과를 result에 대입 
			wins += result;
			
			if(result > 0) {
				System.out.println("당신의 승리!");
			}
			else if(result < 0) {
				System.out.println("당신의 패배...");
			}
			else {
				System.out.println("비겼습니다! Draw!");
			}
		}
		// 세 번의 가위바위보가 끝난 후
		// 총점 wins의 전체 결과를 출력함
		System.out.print("\n삼세판 결과는 : ");
		if(wins > 0) {
			System.out.println("당신의 승리! 🎉🎉🎉🎉");
		}
		else if(wins < 0) {
			System.out.println("당신의 패배... 😢😢");
		}
		else {
			System.out.println("비겼습니다! Draw! 🚩");
		}
			
	}
	
}
