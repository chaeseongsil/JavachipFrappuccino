package com.kh.day18.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.day18.music.controller.MusicController;
import com.kh.day18.music.model.vo.Music;

public class MusicView {
	private MusicController controller;
	
	public MusicView() {
		controller = new MusicController();
	}
	
	public void startProgram() {
		Music mOne;
		String title = "";
		String singer = "";
		int index = 0;
		finish :
		while(true) {
			int choice = this.printMenu();
			switch(choice) {
			case 1 :
				mOne = this.inputMusicInfo();
				controller.addAtLast(mOne);
				this.displaySuccess("추가 성공!");
				break;
			case 2 :
				mOne = this.inputMusicInfo();
				controller.addAtZero(mOne);
				this.displaySuccess("추가 성공!");
				break;
			case 3 :
				this.showAllMusicList(controller.printMusicList());
				break;
			case 4 :
				title = this.inputMusicName("검색");
				List<Music> findList = controller.searchMusicByName(title);
				if(findList.isEmpty()) {
					this.displayError("해당 곡은 존재하지 않습니다.");
					break;
				}
				this.showFindMusicList(findList, title);
				this.displaySuccess("검색 완료!");
				break;
			case 5 :
				singer = this.inputMusicSinger("검색");
				List<Music> singerList = controller.searchMusicBySinger(singer);
				if(singerList.isEmpty()) {
					this.displayError("해당 가수는 존재하지 않습니다.");
					break;
				}
				this.showFindMusicList(singerList, singer);
				this.displaySuccess("검색 완료!");
				break;
			case 6 :
				title = this.inputMusicName("삭제");
				index = controller.findIndexByTitle(title);
				if(index == -1) {
					this.displayError("해당 곡은 존재하지 않습니다.");
					break;
				}
				controller.removeMusic(index);
				this.displaySuccess("삭제 완료!");
				break;
			case 7 :
				title = this.inputMusicName("수정");
				index = controller.findIndexByTitle(title);
				if(index == -1) {
					this.displayError("해당 곡은 존재하지 않습니다.");
					break;
				}
				mOne = this.inputMusicInfo();
				controller.modifyMusic(index, mOne);
				this.displaySuccess("수정 완료!");
				break;
			case 0 :
				System.out.println("프로그램이 종료되었습니다.");
				break finish;
			default :
				break;
			}
			
		}
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=========== 메인 메뉴 ===========");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색(곡명)");
		System.out.println("5. 특정 곡 검색(가수명)");
		System.out.println("6. 특정 곡 삭제");
		System.out.println("7. 특정 곡 정보수정");
		System.out.println("0. 종료");
		System.out.println("================================");
		System.out.print("메뉴 선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public Music inputMusicInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========== 음악 정보 입력 ==========");
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		return music;
	}
	
	public String inputMusicName(String category) {
		Scanner sc = new Scanner(System.in);
		System.out.print(category + "할 곡 입력 : ");
		String title = sc.nextLine();
		return title;
	}
	
	public String inputMusicSinger(String category) {
		Scanner sc = new Scanner(System.in);
		System.out.print(category + "할 가수 입력 : ");
		String singer = sc.nextLine();
		return singer;
	}
	
	public void showAllMusicList(List<Music> mList) {
		System.out.println("========== 전체 곡 목록 출력 ==========");
		int count = 1;
		for(Music music : mList) {
			System.out.printf("%d번째 곡 -> 곡명 : %s, 가수명 : %s\n"
					, count++, music.getTitle(), music.getSinger());
		}
	}
	
	public void showFindMusicList(List<Music> mList, String title) {
		System.out.println("========= <" + title + "> 검색 결과 =========");
		int count = 1;
		for(Music music : mList) {
			System.out.printf("%d번째 곡 -> 곡명 : %s, 가수명 : %s\n"
					, count++, music.getTitle(), music.getSinger());
		}
	}
	public void displaySuccess(String msg) {
		System.out.println("[서비스 성공] " + msg);
	}
	
	public void displayError(String msg) {
		System.out.println("[서비스 실패] " + msg);
	}
}
