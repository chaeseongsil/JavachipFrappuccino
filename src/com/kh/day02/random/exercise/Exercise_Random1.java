package com.kh.day02.random.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {
	public static void main(String [] args)
	{
		// 동전 앞뒤 맞추기!!
//		====== 동전 앞 뒤 맞추기 =======
//		숫자를 입력해주세요 (1.앞면 / 2.뒷면) : 1
//		맞췄습니다.
//		====== 동전 앞 뒤 맞추기 =======
//		숫자를 입력해주세요 (1.앞면 / 2.뒷면) : 2
//		맞췄습니다.
//		====== 동전 앞 뒤 맞추기 =======
//		숫자를 입력해주세요 (1.앞면 / 2.뒷면) : 2
//		틀렸습니다.
//		====== 동전 앞 뒤 맞추기 =======
//		숫자를 입력해주세요 (1.앞면 / 2.뒷면) : 1
//		틀렸습니다.
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		while(true) {
			System.out.println("===== 동전 앞 뒤 맞추기 =====");
			System.out.print("숫자를 입력해주세요 (1.앞면 / 2.뒷면) : ");
			int coin = sc.nextInt();
			if(coin < 0 || coin > 2) {
				System.out.println("1 또는 2를 입력하세요.");
				continue;
			}
			int randCoin = rand.nextInt(2)+1;
			System.out.println("☞◎☜ : " + randCoin);
			if(randCoin == coin) {
				System.out.println("맞췄습니다.");
			}else {
				System.out.println("틀렸습니다.");
			}
		}
	}
}
