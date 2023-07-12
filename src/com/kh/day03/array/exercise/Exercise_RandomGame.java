package com.kh.day03.array.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_RandomGame {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	public void RandomGame1() {
		for(;;) {
			System.out.println("===== 가위 바위 보 게임 =====");
			System.out.print("숫자를 선택하세요(1.가위/2.바위/3.보) : ");
			int userVal = sc.nextInt();
			int pc = rand.nextInt(3)+1;
			System.out.println("========== 결과 ===========");
			switch(userVal) {
			case 1:
				System.out.println("당신은 가위를 냈습니다.");
				break;
			case 2:
				System.out.println("당신은 바위를 냈습니다.");
				break;
			case 3:
				System.out.println("당신은 보를 냈습니다.");
				break;
			default:
				System.out.println("제대로 하세요.");
				continue;
			}
			switch(pc) {
			case 1:
				System.out.println("컴퓨터는 가위를 냈습니다.");
				break;
			case 2:
				System.out.println("컴퓨터는 바위를 냈습니다.");
				break;
			case 3:
				System.out.println("컴퓨터는 보를 냈습니다.");
				break;
			}
			System.out.println("===========================");
			if(userVal == 1) {
				if(pc == 2) {
					System.out.println("당신이 졌습니다. ^^");					
				}else if(pc == 3) {
					System.out.println("당신이 이겼습니다. ^^*");					
				}else {
					System.out.println("비겼습니다~");
				}
			}else if(userVal == 2) {
				if(pc == 1) {
					System.out.println("당신이 이겼습니다. ^^*");
				}else if(pc == 2){
					System.out.println("비겼습니다~");
				}else {
					System.out.println("당신이 졌습니다. ^^");
				}
			}else {
				if(pc == 1) {
					System.out.println("당신이 졌습니다. ^^");
				}else if (pc == 2) {
					System.out.println("당신이 이겼습니다. ^^*");
				}else {
					System.out.println("비겼습니다~");
				}
			}
		}
	}
	
	public void RandomGame2() {
		int win = 0;
		int lose = 0;
		for(;;) {
			System.out.println("===== Up & Down Game =====");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			int choice = sc.nextInt();
			int count = 0;
			if(choice == 1) {
				System.out.println("<< Game Start >>");
				int randNum = rand.nextInt(99)+1;
				for(int i = 6; i >= 0; i--) {
					System.out.print("Input Number : ");
					int inputNum = sc.nextInt();
					if(inputNum == randNum) {
						System.out.println("========= << 정답 >> ==========");
						count++;
						win++;
						System.out.println("=======" + count + "번 만에 맞췄네요!======");
						count = 0;
						break;
					}else if(inputNum < randNum) {
						System.out.println("========= << U P >> ==========");
						count++;
					}else {
						System.out.println("========= << DOWN >> =========");
						count++;
					}
					if(i != 0) {
						System.out.println(i + "번 남았습니다.");						
					}else {
						System.out.println("========== YOU LOSE ==========");
						System.out.println("\t정답 : " + randNum);
						System.out.println("==============================");
						lose++;
					}
				}
			}else if(choice == 2) {
				System.out.println("정답 : " + win + "번, 탈락 : " + lose + "번");
			}else if(choice == 3) {
				System.out.println("게임 종료");
				break;
			}
		}
	}
	public void Br31() {
		while(true) {
			System.out.println("Baskin Robbins31 Game");
			System.out.println();
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("<< Game Start >>");
				System.out.print("Input Number(1~3)");
				int input = sc.nextInt();
			}
		}
		
	}
}
