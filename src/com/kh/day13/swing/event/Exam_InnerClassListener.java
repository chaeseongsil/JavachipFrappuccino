package com.kh.day13.swing.event;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_InnerClassListener extends JFrame{
	public Exam_InnerClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
		
	}
	private class MyActionListener implements ActionListener{
		// 이벤트 리스너는 ActionListenr 인터페이스(상수, 추상메소드로만 이루어짐)를 상속받음
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource(); // this같은 역할, JButton으로 형변환
			if(btn.getText().equals("Action")) {
				btn.setText("액션");
			}else {
				btn.setText("Action");
			}
			Exam_InnerClassListener.this.setTitle(btn.getText() + " 이벤트 리스너 예제");
			// InnerClassListener 일때만 사용 가능
		}
	}
	public static void main(String[] args) {
		new Exam_InnerClassListener();
	}
}

