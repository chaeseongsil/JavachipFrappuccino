package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_Read {
	public static void main(String[] args) {
//	Reader reader = new Reader();
		// Cannot instantiate the type Reader
		// Reader 는 추상클래스라 객체 생성이 안됨
		Reader reader = null;
		
		try {
			// Checked Exception이라고 함
			// Unhandled exception type IOException
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");
			while(true) {
				int readData = reader.read();
				if(readData == -1) break;
				System.out.print((char)readData);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// Unhandled exception type IOException
			// 스트림은 항상 사용 후 자원을 해제해주어야 함
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// Unhandled exception type FileNotFoundException
		// try ~ catch 써야함
	}
	
}
