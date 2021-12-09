package application;

import game.Game;

public class App {

	public static void main(String[] args) {
		// 여기서부터 프로그램 시작
//		Game game = new Game();
//		game.run();
		
		// 단순히 run()만 실행할거라 객체생성과정을 생략해도 됨, 단 run의 주소는 알 수 없고 실행만 됨
		new Game().run();
		
		// 클래스 불러오기 할 때 1) ctrl + 스페이스  2) ctrl + shift + o (여러개 한꺼번에)
	}

}
