package com.kh.day18.music.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.kh.day18.music.model.vo.Music;

public class MusicDAO {
	private List<Music> mList;
	
	public MusicDAO() {
		mList = new ArrayList<Music>();
	}
	
	public void addAtLast(Music music) {
		mList.add(music);
	}
	
	public void addAtZero(Music music) {
		mList.add(0, music);
	}
	
	public List<Music> printMusicList(){
		return mList;
	}
	
	public void removeMusic(int i) {
		mList.remove(i);
	}
	
	public void modifyMusic(int i, Music music) {
		mList.set(i, music);
	}
	
	public List<Music> searchMusicByName(String name){
		List<Music> findList = new ArrayList<Music>();
		for(int i = 0; i < mList.size(); i++) {
			if(mList.get(i).getTitle().equals(name)) {
				findList.add(mList.get(i));
			}
		}
		return findList;
	}
	public List<Music> searchMusicBySinger(String singer){
		List<Music> findList = new ArrayList<Music>();
		for(int i = 0; i < mList.size(); i++) {
			if(mList.get(i).getSinger().equals(singer)) {
				findList.add(mList.get(i));
			}
		}
		return findList;
	}
	
	public int findIndexByTitle(String title) {
		for(int i = 0; i < mList.size(); i++) {
			if(mList.get(i).getTitle().equals(title)) {
				return i;
			}
		}
		return -1;
	}
}
