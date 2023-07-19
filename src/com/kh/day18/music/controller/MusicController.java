package com.kh.day18.music.controller;

import java.util.List;

import com.kh.day18.music.model.dao.MusicDAO;
import com.kh.day18.music.model.vo.Music;

public class MusicController {
	private MusicDAO musicDao;
	
	public MusicController() {
		musicDao = new MusicDAO();
	}
	/**
	 * 마지막 위치에 곡 정보 등록
	 * @param music 입력받은 값으로 만들어진 Music 객체
	 */
	public void addAtLast(Music music) {
		musicDao.addAtLast(music);
	}
	/**
	 * 첫 위치에 곡 정보 등록
	 * @param music 입력받은 값으로 만들어진 Music 객체
	 */
	public void addAtZero(Music music) {
		musicDao.addAtZero(music);
	}
	/**
	 * 곡 정보 삭제
	 * @param i 인덱스 값
	 */
	public void removeMusic(int i) {
		musicDao.removeMusic(i);
	}
	/**
	 * 곡 정보 수정
	 * @param i 인덱스 값
	 * @param music 수정할 정보를 입력받아 만들어진 Music 객체
	 */
	public void modifyMusic(int i, Music music) {
		musicDao.modifyMusic(i, music);
	}
	/**
	 * 전체 정보 출력
	 * @return List 전체 정보인 List 출력
	 */
	public List<Music> printMusicList() {
		return musicDao.printMusicList();
	}
	/**
	 * 이름으로 검색한 목록 출력
	 * @param name 입력받은 title값
	 * @return findList 동명의 title로 구성된 list
	 */
	public List<Music> searchMusicByName(String name) {
		return musicDao.searchMusicByName(name);
	}
	/**
	 * 가수명으로 검색한 목록 출력
	 * @param singer 입력받은 가수명
	 * @return findList 해당 가수의 곡 List
	 */
	public List<Music> searchMusicBySinger(String singer) {
		return musicDao.searchMusicBySinger(singer);
	}
	/**
	 * 이름으로 검색해서 인덱스값 구하기
	 * @param title 입력받은 값
	 * @return index 검색된 index값
	 */
	public int findIndexByTitle(String title) {
		return musicDao.findIndexByTitle(title);
	}
}
