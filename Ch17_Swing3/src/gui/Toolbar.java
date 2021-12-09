package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

//class ColorButtonListener implements ActionListener {
//	private MainPanel mainPanel;
//	private Color c;
//	
//	public ColorButtonListener(MainPanel mainPanel, Color c) {
//		this.mainPanel = mainPanel;
//		this.c = c;
//	}
//	public void actionPerformed(ActionEvent e) {
//		mainPanel.setBackground(c);
//	}
//}

// Ch15와 결과는 같지만 클래스 없이 사용할 수 있도록 익명클래스를 이용해 간소화
public class Toolbar extends JToolBar {
	private static final long serialVersionUID = 1L;
	
	public Toolbar(MainPanel mainPanel) {
		final JButton redButton = new JButton("RED");
		final JButton blueButton = new JButton("BLUE");
		// 버튼에 이벤트를 연결('클릭' 이벤트)
		// 익명 클래스를 람다식으로 변경하여 같은 코드를 짧게 만듦
		// 람다식 문법 : (매개변수) -> {함수코드작성}
		redButton.addActionListener(e -> mainPanel.setBackground(Color.red));
		blueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.setBackground(Color.blue);
			}
		});
		
		add(redButton);
		add(blueButton);
	}
}
