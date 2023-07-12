package com.kh.day13.swing.event.exercise;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercise_MovingText extends JFrame{
	// 상,하,좌,우 키로 텍스트 움직이기
	private final int MOVING_UNIT = 10;
	
	public Exercise_MovingText() {
		setTitle("상,하,좌,우 키로 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel la = new JLabel("Hello");
		
		Container c = getContentPane();
		la.setLocation(50, 50);
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				int x = la.getX();
				int y = la.getY();
				switch(keyCode) {
				case KeyEvent.VK_UP :
					la.setLocation(x, y - MOVING_UNIT);
					break;
				case KeyEvent.VK_DOWN :
					la.setLocation(x, y + MOVING_UNIT);
					break;
				case KeyEvent.VK_LEFT :
					la.setLocation(x - MOVING_UNIT, y);
					break;
				case KeyEvent.VK_RIGHT :
					la.setLocation(x + MOVING_UNIT, y);
					break;
				}

			}
		});
		c.add(la);
		setSize(300, 300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	public static void main(String[] args) {
		new Exercise_MovingText();
	}
}
