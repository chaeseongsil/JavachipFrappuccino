package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {
	public static void main(String[] args) {
		Reader reader = null;
		
		try {
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");
			int readCharCount;
			char [] cBuf = new char[3];
			// 3개짜리 배열 -> 파일 텍스트를 3개씩 읽어들임
			String result = "";
			while(true) {				
				readCharCount = reader.read(cBuf); // 배열의 크기만큼 읽어들이기
//				System.out.print(readCharCount);
				if(readCharCount == -1 ) break;
				result += new String(cBuf, 0, readCharCount); // (cBuf, 0, 읽은길이)
//				for(char c : cBuf) {
//					System.out.print(c);
//				}
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
