package com.kh.day17.network.socket.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer {

	public static void main(String[] args) {
		// 채팅서버를 구동 중입니다...
		// 채팅서버를 구동하였습니다..
		// 클라이언트의 접속을 기다리고 있습니다.
		// 클라이언트가 접속하였습니다.
		// 채팅이 시작되었습니다.
		// 서버(나) : 하이
		// 클라이언트(상대) : 네네
		ServerSocket serverSocket = null;
		int port = 8888;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;	// 보조스트림, 기본 데이터타입 입출력을 도와줌
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);	// System.in -> 표준 입력 스트림
		try {
			System.out.println("채팅 서버를 구동중입니다...");
			serverSocket = new ServerSocket(port);	// serverSocket 객체는 Checked Exception
			System.out.println("채팅서버를 구동하였습니다..");
			System.out.println("클라이언트의 접속을 기다리고 있습니다.");
			Socket socket = serverSocket.accept();	// 연결이 완료되면 Socket 객체를 리턴함
			System.out.println("클라이언트가 접속하였습니다.");
			// ===============================================> 서버 구동
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("채팅이 시작되었습니다.");
			// ===============================================> 채팅 준비
			while(true) {
				System.out.print("서버(나) : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);	// 보내기
				dos.flush();
				
				String recvMsg = dis.readUTF();
				System.out.printf("클라이언트(상대) : %s\n", recvMsg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
