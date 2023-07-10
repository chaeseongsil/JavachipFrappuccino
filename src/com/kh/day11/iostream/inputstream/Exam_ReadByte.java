package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {
	public static void main(String[] args) {
		// 사진이나 동영상파일을 읽을 때 필요함 - 배열로 한꺼번에 퍼담기
		InputStream is = null;
		try {
			is = new FileInputStream("src/com/kh/day11/iostream/reading.txt");
			int readByteCount; // 읽은 개수
			byte [] readBytes = new byte[3];
			String result = "";
//			while(true) {
//				readByteCount = is.read(readBytes);
//				if(readByteCount == -1) break;
//				result += new String(readBytes, 0, readByteCount); //읽은데까지만 스트링으로 바꿔라
//			}
//			System.out.println(result);
			while((readByteCount = is.read(readBytes)) != -1) {
				result += new String(readBytes, 0, readByteCount); 
				// 바이트 배열을 스트링으로 변환해서 넣어줌 
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
