package com.kh.day11.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteStr {
	public static void main(String[] args) {
		// 3. 문자열을 넣어버리는 방법
		Writer writer = null;
		try {
			writer = new FileWriter("src/com/kh/day11/iostream/writing3.txt");
//			char [] cbuf = "JDBC/JSP/Servlet".toCharArray();
			writer.write("JDBC/JSP/Servlet"); // 배열에 담지 않고 바로 적용 가능함
			writer.flush();
			System.out.println("쓰기 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
