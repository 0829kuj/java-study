package application;

import game.Game;

public class App {

	public static void main(String[] args) {
		// enum을 이용해 클래스를 상수로 바꾸어 축약
		
		// 여기서부터 프로그램 시작
		// 단순히 run()만 실행할거라 객체생성과정을 생략해도 됨, 단 run의 주소는 알 수 없고 실행만 됨
		new Game().run();
		
	}

}
