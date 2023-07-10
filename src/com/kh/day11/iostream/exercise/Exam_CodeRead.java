package com.kh.day11.iostream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_CodeRead {
	public static void main(String[] args) {
		// Exam_FileCopy.java 파일을 읽어서 콘솔에 출력해보세요~!
		InputStream is = null;
		try {
			is = new FileInputStream("src/com/kh/day11/iostream/exercise/Exam_FileCopy.java");
			// is.read(); 로 읽어들이면 한개씩 읽어들이기 때문에 파일이 클 수록 시간이 오래걸림
			byte [] readBytes = new byte[1024];
			int readByteCount;
			String result = "";
			while((readByteCount = is.read(readBytes)) != -1) {
				result += new String(readBytes, 0, readByteCount);
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
