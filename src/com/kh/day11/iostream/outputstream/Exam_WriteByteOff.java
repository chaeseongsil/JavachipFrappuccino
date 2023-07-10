package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByteOff {
	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("src/com/kh/day11/iostream/outputting3.txt");
			byte [] data = "레알 입출력".getBytes();
			os.write(data, 0, 16); // 0 - 시작위치, 4 - 문자 갯수
			// 한글은 2바이트의 배수가 아니면 깨질 수 있음
			// 문자 기반 스트림을 사용하면 깨지지 않음
			os.flush(); // 버퍼 비우기
			System.out.println("파일 쓰기 완료!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
