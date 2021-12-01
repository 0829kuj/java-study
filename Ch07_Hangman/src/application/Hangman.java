package application;

import java.util.Scanner;

public class Hangman {
	private boolean running = true;		// 게임을 계속 진행핳지 여부
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in);
	
	// 프로그램을 실행하는 run메소드
	public void run() {
		do {		// 세 개의 메소드 생성
			displayWord();		// 화면에 단어표시
			getUserInput();		// 사용자로부터 철자 하나를 입력받음
			checkUserInput();	// 맞는지 체크 (전부 맞으면 running = false)
			
		}while(running);
		
	}
	
	private void displayWord() {
//		System.out.println("화면에 단어 표시");
		// (2) 랜덤 워드 객체를 생성해 랜덤으로 한 단어를 출력한다.
		System.out.println(word.toString());
		
	}
	
	private void getUserInput() {
//		System.out.println("철자 하나 입력");
		// 유저에게 한 문자 입력 요구
		// 입력받은 문자열에서 한 문자를 뽑아 RandomWord 객체에 전달 
		// (addGuess(문자) 메소드를 만들자)
		System.out.print("한 문자 입력 : ");
		String guess = scanner.nextLine();		// 입력받은 문자열을 guess에 저장
		// 입력받은 문자가 단어에 있는지 확인하여 처리 (단어는 RamdomWord 객체 word를 사용)
		word.addGuess(guess.charAt(0));		// 첫 번째 문자를 입력, .charAt(인덱스번호)	: 인덱스 번호의 문자(문자열x)를 선택
		
	}
	
	private void checkUserInput() {
//		System.out.println("true check");
		// 유저가 단어를 다 맞췄는제 체크하여 게임을 종료
		// 게임 종룔 확인을 하는 메소드 isCompleted를 RandomWord 클래스에 만들기
		if(word.isCompleted()) {
			System.out.println("잘 맞췄어요!");
			System.out.println("정답은 " + word.toString());
			running = false;		// 반복문을 빠져나옴 => 종료
		}
		
	}

	/**
	 * 스캐너를 닫는 메소드
	 */
	// 메소드 위에 /** */ 사이에 설명을 써두면 다른 클래스에서 메소드를 사용할때 설명창이 떠 참고할수있음
	public void close() {
		scanner.close();
	}


}
