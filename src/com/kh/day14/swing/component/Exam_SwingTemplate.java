package com.kh.day14.swing.component;

import java.awt.Container;

import javax.swing.JFrame;

public class Exam_SwingTemplate extends JFrame{
	
	public Exam_SwingTemplate() {
		setTitle("TextField 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exam_SwingTemplate();
	}

}
