package gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;	// 오류를 없애기 위해 넣는문장

	public MainFrame(String title) {	// 생성자
		super(title);	// 창에 이름을 넣어서 생성
		// 패널 넣기
		// 먼저 레이아웃 설정
		final MainPanel mainPanel = new MainPanel();
		setLayout(new BorderLayout());	// 창에 컴포넌트를 붙이기 위한 레이아웃
		
		add(new Toolbar(mainPanel), BorderLayout.NORTH);	// 위쪽에 툴바 붙이기
		add(mainPanel, BorderLayout.CENTER);	// 위에서 만든 패널을 레이아웃의 가운데 붙이기
		
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
