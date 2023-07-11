package com.kh.day12.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.day12.music.model.vo.Music;

public class MusicController {
	List<Music> mList;
	
	public MusicController() {
		mList = new ArrayList<Music>();
		
	}
	
	/**
	 * 마지막 위치에 곡 추가
	 * @param music
	 */
	public void addAtLast(Music music) {
		mList.add(music);
	}
	
	/**
	 * 첫 위치에 곡 추가
	 * @param music
	 */
	public void addAtZero(Music music) {
		mList.add(0, music);
	}
	/**
	 * 곡 수정하기
	 * @param index
	 * @param music
	 */
	public void updateMusic(int index, Music music) {
		mList.set(index, music);
	}

	/**
	 * 곡 삭제하기
	 * @param i
	 */
	public void removeMusic(int i) {
		// mList에서 삭제
		mList.remove(i);
	}

	/**
	 * 음악 전체 정보 출력
	 * @return mList
	 */
	public List<Music> printMusicList() {
		return mList;
	}
	/**
	 * 검색한 곡 출력
	 * @param title
	 * @return
	 */
	public List<Music> searchMusicsByName(String title) {
		// 찾은 음악을 담을 리스트
		List<Music> findList = new ArrayList<Music>();
		// 기존 음악이 있는 mList에서 찾기
		for(Music mOne : mList) {
			// 입력한 이름이 같으면
			if(mOne.getTitle().equals(title)) {
				// findList에 추가하기
				findList.add(mOne);
			}
		}
		// 다 찾았으면 리턴
		return findList;
	}
	/**
	 * 특정 곡 검색해서 index값 리턴하기
	 * @param title
	 * @return
	 */
	public int searchOneByTitle(String title) {
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if(music.getTitle().equals(title)) {
				return i;
			}
		}
		return -1;
	}
	public void insertionSortByTitleASC() {
		for(int i = 1; i < mList.size(); i++) {
			for(int j = i; j > 0; j--) {
				Music mOne = mList.get(j-1);
				Music mTwo = mList.get(j);
				if(mOne.getTitle().compareTo(mTwo.getTitle()) > 0) {
					Music temp = mOne;
					mList.set(j-1, mTwo);
					mList.set(j, temp);
				}
			}
		}
	}
	public void selectionSortByTitleASC() {
		// 선택정렬 연습
		int min; // 인덱스 값 저장
		for(int i = 0; i < mList.size(); i++) {
			Music mOne;
			Music mTwo;
			min = i;
			for(int j = i+1; j < mList.size(); j++) {
				mOne = mList.get(min);
				mTwo = mList.get(j);
				if(mOne.getTitle().compareTo(mTwo.getTitle()) > 0) {
					min = j;
				}
			}
			Music temp = mList.get(min);
			mList.set(min, mList.get(i));
			mList.set(i, temp);			
		}
	}

	public void bubbleSortByTitleASC() {
		// int [] nums; -> mList로 변경 필요
		for(int i = 0; i < mList.size(); i++) {
			for(int j = 0; j < (mList.size()-1)-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				// The operator > is undefined for the argument type(s)
				// java.lang.String, java.lang.String
				// 스트링끼리 비교할 때 >, < 안됨
				// 결과값이 0이면 동일함
				// 결과값이 양수값이면 왼쪽이 순서가 더 큼
				// 결과값이 음수값이면 왼쪽이 순서가 더 작음
				if(mOne.getTitle().compareTo(mTwo.getTitle()) > 0) {
					Music temp = mOne;
					mList.set(j,  mTwo);
					mList.set(j+1, temp);
				}
			}
		}
	}	
	public void bubbleSortByTitleDESC() {
		// int [] nums; -> mList로 변경 필요
		for(int i = 0; i < mList.size(); i++) {
			for(int j = 0; j < (mList.size()-1)-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				// The operator > is undefined for the argument type(s)
				// java.lang.String, java.lang.String
				// 스트링끼리 비교할 때 >, < 안됨
				// 결과값이 0이면 동일함
				// 결과값이 양수값이면 왼쪽이 순서가 더 큼
				// 결과값이 음수값이면 왼쪽이 순서가 더 작음
				if(mOne.getTitle().compareTo(mTwo.getTitle()) < 0) {
					Music temp = mOne;
					mList.set(j,  mTwo);
					mList.set(j+1, temp);
				}
			}
		}
	}

	public void bubbleSortBySingerASC() {
		for(int i = 0; i < mList.size(); i++) {
			for(int j = 0; j < (mList.size()-1)-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				// The operator > is undefined for the argument type(s)
				// java.lang.String, java.lang.String
				// 스트링끼리 비교할 때 >, < 안됨
				// 결과값이 0이면 동일함
				// 결과값이 양수값이면 왼쪽이 순서가 더 큼
				// 결과값이 음수값이면 왼쪽이 순서가 더 작음
				if(mOne.getSinger().compareTo(mTwo.getSinger()) > 0) {
					Music temp = mOne;
					mList.set(j,  mTwo);
					mList.set(j+1, temp);
				}
			}
		}
	}

	public void bubbleSortBySingerDESC() {
		for(int i = 0; i < mList.size(); i++) {
			for(int j = 0; j < (mList.size()-1)-i; j++) {
				Music mOne = mList.get(j);
				Music mTwo = mList.get(j+1);
				// The operator > is undefined for the argument type(s)
				// java.lang.String, java.lang.String
				// 스트링끼리 비교할 때 >, < 안됨
				// 결과값이 0이면 동일함
				// 결과값이 양수값이면 왼쪽이 순서가 더 큼
				// 결과값이 음수값이면 왼쪽이 순서가 더 작음
				if(mOne.getSinger().compareTo(mTwo.getSinger()) < 0) {
					Music temp = mOne;
					mList.set(j,  mTwo);
					mList.set(j+1, temp);
				}
			}
		}
	}	
}
