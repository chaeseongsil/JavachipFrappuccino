package com.kh.day10.collection.music;

import java.util.Scanner;

public class MusicRun {
	public static void main(String[] args) {
		MusicFunction mFunc = new MusicFunction();
		end : 
		while(true) {
			Scanner sc = new Scanner(System.in);
			int choice = mFunc.printMenu();
			switch(choice) {
			case 1:
				mFunc.addLastIndex();
				break;
			case 2: 
				mFunc.addFirstIndex();
				break;
			case 3:
				mFunc.showMusicList();
				break;
			case 4:
				mFunc.searchSong();
				break;
			case 5:
				mFunc.removeSong();
				break;
			case 6:
				mFunc.modifySong();
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break end;
			}
		}
	}
}
