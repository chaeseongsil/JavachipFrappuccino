package com.kh.day16.swing.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

public class Exam_JColorChooser extends JFrame{
	private JLabel la;

	public Exam_JColorChooser() {
		la = new JLabel("Hello");
		setTitle("JColorChooser 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		la.setHorizontalAlignment(SwingConstants.CENTER);
		la.setFont(new Font("Ravie", Font.ITALIC, 30));
		c.add(la, BorderLayout.CENTER);
		createMenu();
		setSize(250, 200);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("Text");				// Text
		JMenuItem item = new JMenuItem("Color");	//  ㄴColor
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Color selectedColor = 	// 선택된 색깔은 Color Type으로 리턴됨
						JColorChooser.showDialog(null, "ColorPicker", Color.YELLOW);
				la.setForeground(selectedColor);	// 선택한 색으로 글씨색 설정
			}
		});
		menu.add(item);
		bar.add(menu);
		setJMenuBar(bar);
	}

	public static void main(String[] args) {
		new Exam_JColorChooser();
	}

}
