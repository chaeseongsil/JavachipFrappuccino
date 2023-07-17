package com.kh.day16.network.exam1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Exam_Server {

	public static void main(String[] args) {
		System.out.println("Server");
		ServerSocket server = null;
		
		try {
			System.out.println("연결 기다림");
			server = new ServerSocket(4885); // 1. 열어놓음
			while(true) {
				Socket serverSocket = server.accept(); // 2. 연결 대기
				System.out.println("클라이언트 접속 완료"); // 4. 완료 출력				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
