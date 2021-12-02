package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

class ColorButtonListener implements ActionListener {
	private MainPanel mainPanel;
	private Color c;
	
	public ColorButtonListener(MainPanel mainPanel, Color c) {
		this.mainPanel = mainPanel;
		this.c = c;
	}
	
	public void actionPerformed(ActionEvent e) {
		mainPanel.setBackground(c);
	}
}


public class Toolbar extends JToolBar {
	private static final long serialVersionUID = 1L;
	
	public Toolbar(MainPanel mainPanel) {
		
		final JButton redButton = new JButton("RED");
		final JButton blueButton = new JButton("BLUE");
		// 버튼에 이벤트를 연결('클릭' 이벤트)
		redButton.addActionListener(new ColorButtonListener(mainPanel, Color.red));
		blueButton.addActionListener(new ColorButtonListener(mainPanel, Color.blue));
		
		add(redButton);
		add(blueButton);
	}
}
