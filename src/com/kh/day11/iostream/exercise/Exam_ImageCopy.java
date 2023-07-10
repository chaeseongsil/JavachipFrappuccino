package com.kh.day11.iostream.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_ImageCopy {
	public static void main(String[] args) {
		// 바이트 스트림을 이용하여 바이너리 파일을 복사하는 프로그램을 작성하라
		// c:\Windows\Web\Wallpaper\Theme1\img1.jpg를 c:\Temp\copyimg.jpg로 복사하였습니다.		
		InputStream is = null;
		OutputStream os = null;
		File imgSrc = new File("c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
		File copySrc = new File("c:\\Temp\\copyimg.jpg");
		try {
			is = new FileInputStream(imgSrc);
			os = new FileOutputStream(copySrc);
			byte [] readBytes = new byte[1024 * 10]; // 10kb씩 읽게 해서 속도 빠르게 하기
			int readByteCount;
			while((readByteCount = is.read(readBytes)) >= readBytes.length) { 
				// 읽은 갯수가 현저히 적어지면 무한반복 탈출
				os.write(readBytes, 0, readByteCount);
			}
			os.flush();
			System.out.printf("%s를 %s로 복사하였습니다.", imgSrc.getPath(), copySrc.getPath());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
