package com.kh.day17.network.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.text.SimpleDateFormat;

public class BaseballServer {
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 8888;
		Date date = new Date();
		SimpleDateFormat trans = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
		String transDate = trans.format(date);
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		int [] numbers = new int[3];
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("서버 소켓을 생성하였습니다.");
			System.out.println(transDate);
			Thread.sleep(1000);
			System.out.println("클라이언트의 접속을 기다립니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속했습니다.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			// 중복 제거
			for(int i = 0; i < numbers.length; i++) {
				// (int) Math.random() * (최대값 - 최소값 + 1) + 최소값
				numbers[i] = (int)(Math.random()*9+1);
				for(int j = 0; j < i; j++) {
					if(numbers[i] == numbers[j]) {
						i--;
						break;
					}
				}
			}
			System.out.printf("서버 숫자 -> %d %d %d\n", numbers[0], numbers[1], numbers[2]);
			System.out.println("서버 준비 완료");
			while(true) {
				String recvMsg = dis.readUTF();
				System.out.printf("받기 : %s\n", recvMsg);
				String [] inputNums = recvMsg.split(" ");
				int strike = 0;
				int ball = 0;
				for(int i = 0; i < numbers.length; i++) {
					for(int j = 0; j < inputNums.length; j++) {
						if(numbers[i] == Integer.parseInt(inputNums[j])) {
							if(i == j) {
								strike++;								
							}else {
								ball++;
							}
						}
					}
				}
				String sendMsg = strike + "스트라이크 " + ball + " 볼";
				System.out.println(sendMsg);
				dos.writeUTF(sendMsg);
				dos.flush();
				if(strike == 3) {
					System.out.println("아웃! 게임종료");
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
