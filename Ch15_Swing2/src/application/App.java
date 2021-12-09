package application;

import javax.swing.SwingUtilities;

import gui.MainFrame;

public class App {

	public static void main(String[] args) {
		// 자바 swing 프로그램
		// JFrame 은 윈도우창
		SwingUtilities.invokeLater(() -> {	// 스윙의 안정성을 위해 넣는 문장
			new MainFrame("테스트 스윙 앱");
			
		});
	}
}
