package com.kh.day13.swing.event;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_AnonymousClassListener extends JFrame{
	public Exam_AnonymousClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new ActionListener() {
			// 클래스를 따로 만들지 않고 
			// ActionListener 인터페이스를 통해 익명클래스로 이벤트 추가
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource(); // this같은 역할, JButton으로 형변환
				if(btn.getText().equals("Action")) {
					btn.setText("액션");
				}else {
					btn.setText("Action");
				}
				setTitle(btn.getText() + " 이벤트 리스너 예제");
				// setTitle을 그대로 쓸 수 있음
			}
		});
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Exam_AnonymousClassListener();
	}
}

