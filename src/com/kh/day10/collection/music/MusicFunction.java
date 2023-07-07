package com.kh.day10.collection.music;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MusicFunction {
	Scanner sc = new Scanner(System.in);
	List<Music> musicList;
	
	public MusicFunction() {
		musicList = new ArrayList<Music>();
	}
	public int printMenu() {
		System.out.println("=========== 메인 메뉴 ===========");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.println("================================");
		System.out.print("메뉴 선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}
	public void addLastIndex() {
		System.out.println("===== 마지막 위치에 곡 추가 ======");
		System.out.print("곡명 : ");
		sc.nextLine();
		String songName = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.next();
		Music music = new Music(songName, singer);
		musicList.add(music);
	}
	public void addFirstIndex() {
		System.out.println("===== 첫 위치에 곡 추가 ======");
		System.out.print("곡명 : ");
		sc.nextLine();
		String songName = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.next();
		Music music = new Music(songName, singer);
		musicList.add(0, music);
	}
	// 음악 전체 출력
	public void showMusicList() {
		System.out.println("====== 전체 곡 목록 출력 =====");
		if(!musicList.isEmpty()) {
			for(int i = 0; i < musicList.size(); i++) {
				System.out.println((i+1) + "번째 노래 -> " + musicList.get(i).toString());
			}
			System.out.println("[서비스 성공] : 조회 성공!");
		}else {
			System.out.println("[서비스 실패] : 등록된 노래가 없습니다.");
		}
	}
	// 곡명으로 음악 검색하기
	public void searchSong() {
		System.out.print("검색할 곡 입력 : ");
		sc.nextLine();
		String keyword = sc.nextLine();
		boolean success = false;
		for(Music music : musicList) {
			if(music.getMusicName().equals(keyword)) {
				System.out.println("검색 결과 >> " + music.toString());
				success = true;
				break;
			}
		}
		if(success) {
			System.out.println("[서비스 성공] : 조회 성공!");
		}else {			
			System.out.println("[서비스 실패] : 없는 노래입니다.");
		}
	}
	// 곡명으로 삭제하기
	public void removeSong() {
		System.out.print("삭제할 곡 입력 : ");
		sc.nextLine();
		String keyword = sc.nextLine();
		boolean success = false;
		for(int i = 0; i < musicList.size(); i++) {
			Music music = musicList.get(i);
			if(music.getMusicName().equals(keyword)) {
				musicList.remove(i);
				success = true;
				break;
			}
		}
		if(success) {
			System.out.println("[서비스 성공] : 삭제 성공!");
		}else {			
			System.out.println("[서비스 실패] : 없는 노래입니다.");
		}
	}
	// 곡 수정하기
	public void modifySong() {
		System.out.print("수정할 곡 입력 : ");
		sc.nextLine();
		String keyword = sc.nextLine();
		boolean success = false;
		for(int i = 0; i < musicList.size(); i++) {
			if(musicList.get(i).getMusicName().equals(keyword)) {
				System.out.print("수정할 곡명 입력 : ");
				String title = sc.nextLine();
				System.out.print("수정할 가수명 입력 : ");
				String singer = sc.next();
				musicList.set(i, new Music(title, singer));
				success = true;
			}
		}
		if(success) {
			System.out.println("[서비스 성공] : 수정 성공!");
		}else {			
			System.out.println("[서비스 실패] : 없는 노래입니다.");
		}
	}
	public void sortAsc() {
	}
}
