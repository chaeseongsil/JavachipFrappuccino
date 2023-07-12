package com.kh.day13.swing.basic;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_ContentPane extends JFrame{
	
	public Exam_ContentPane() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		// 종료 버튼 누르면 실제 종료하도록 함. 그 전엔 안보이게만 했음
		
		Container contentPane = getContentPane(); // JFrame이 가지고 있는 메소드 getContentPane()
		contentPane.setBackground(Color.PINK); // 대문자+기울어짐 -> static
		contentPane.setLayout(new FlowLayout()); // 버튼을 차례대로 만들어주는 레이아웃
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancle"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 150);
		setVisible(true); // setVisible없으면 실행만 되고 보이지 않음
	}

	public static void main(String[] args) {
		new Exam_ContentPane();
	}

}
