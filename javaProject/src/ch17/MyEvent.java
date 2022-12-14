package ch17;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyEvent extends JFrame {
	private JButton button1,button2,button3,button4;
	
	public MyEvent() {
		setTitle("BorderLayout");
		setSize(700, 600);
		setVisible(true);
		
		//버튼 생성
		button1 = new JButton("North");
		button2 = new JButton("East");
		button3 = new JButton("South");
		button4 = new JButton("West");
		
		//버튼 컴포넌트를 BorderLayout의 각 영역에 배치
		add(button1, "North");
		add(button2, "East");
		add(button3, "South");
		add(button4, "West");
		
		button1.addActionListener(new MyColorAction(this, Color.red));
		button2.addActionListener(new MyColorAction(this, Color.green));
		button3.addActionListener(new MyColorAction(this, Color.blue));
		button4.addActionListener(new MyColorAction(this, Color.yellow));
		
		//윈도우 창닫기
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new MyEvent();
	}
}
