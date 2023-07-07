package com.kh.day10.collection.music;

public class Music {
	private String musicName;
	private String singer;
	
	public Music() {
		musicName = "";
		singer = "";
	}
	public Music(String musicName, String singer) {
		this.musicName = musicName;
		this.singer = singer;
	}
	
	// getter
	public String getMusicName() {
		return this.musicName;
	}
	public String getSinger() {
		return this.singer;
	}
	
	// setter
	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	@Override
	public String toString() {
		return "곡명 : " + this.musicName + ", 가수명 : " + this.singer;
	}
}
