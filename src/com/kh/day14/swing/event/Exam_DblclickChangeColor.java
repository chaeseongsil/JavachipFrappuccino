package com.kh.day14.swing.event;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class Exam_DblclickChangeColor extends JFrame{

	public Exam_DblclickChangeColor() {
		setTitle("Click and DoubleClick Change BackgroundColor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.BLACK);
		c.addMouseListener(new MyMouseListener());
		
		setSize(300, 200);
		setVisible(true);
	}
	private class MyMouseListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			// 더블 클릭 구현, 클릭 카운트수가 2면 더블클릭!
			if(e.getClickCount() == 2) {
				// (int) Math.random() * (최대값 - 최소값 + 1) + 최소값
				// 0 ~ 255 범위의 랜덤한 수를 출력하는 방법
				int r = (int)(Math.random()*256);
				int g = (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				Component c = (Component)e.getSource();
				c.setBackground(new Color(r,g,b));
			}
		}
	}
	public static void main(String[] args) {
		new Exam_DblclickChangeColor();
		System.out.println(Math.random());
	}

}
