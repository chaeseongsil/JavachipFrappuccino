package com.kh.day14.swing.event;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_MouseListenerAll extends JFrame{
	private JLabel la;
	
	public Exam_MouseListenerAll() {
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		la = new JLabel("No Mouse Event");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		MyMouseListener listener = new MyMouseListener();
		c.addMouseMotionListener(listener);
		c.addMouseListener(listener);
		c.add(la);
		
		setSize(300, 200);
		setVisible(true);
	}
	private class MyMouseListener implements MouseListener, MouseMotionListener{
		// 추상클래스는 여러개 상속 불가, 인터페이스는 여러개 상속 가능 -> 다중 구현
		// 내부클래스로 할 거면 밖에서 건드리지 못하게 private으로 선언
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			Component c = (Component)e.getSource();
			// 마우스 이벤트가 발생한 해당 소스를 가지고 옴
			c.setBackground(new Color(207, 223, 159));
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			Component c = (Component)e.getSource();
			// 마우스 이벤트가 발생한 해당 소스를 가지고 옴
			c.setBackground(new Color(155, 225, 227));
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("MouseDragged(" + e.getX() + ", " + e.getY() + ")");
		}
		
		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setText("MouseMoved(" + e.getX() + ", " + e.getY() + ")");
		}
		
	}
	
	public static void main(String[] args) {
		new Exam_MouseListenerAll();
	}

}
