package application;

import javax.swing.SwingUtilities;

import gui.MainFrame;

public class HelloWorld {

	public static void main(String[] args) {
		// 자바 swing 프로그램
		// JFrame 은 윈도우창
		SwingUtilities.invokeLater(() -> {	// 스윙의 안정성을 위해 넣는 문장
			new MainFrame("테스트 스윙 앱");
			
//			JFrame mainFrame = new JFrame(); // 새 윈도우창 생성
//			mainFrame.setSize(600, 400); // 창 사이즈 가로600 세로400
//			mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫을 시 프로그램 종료
//			mainFrame.setVisible(true); // 창을 보이게 함
		});
	}
}
