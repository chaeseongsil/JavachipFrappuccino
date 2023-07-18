package com.kh.day17.oop.motel.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.day17.oop.motel.domain.vo.Room;

public class MotelController {
	List<Boolean> rList;
	
	public MotelController() {
		rList = new ArrayList<Boolean>();
		for(int i = 0; i < 10; i++) {
			rList.add(false);
		}
	}
	public List<Boolean> printAllRooms() {
		return rList;
	}
	public void checkIn(int roomNo) {
		if(roomNo > 0 && roomNo < 11) {
			Boolean room = rList.get(roomNo-1);
			if(!room) {
				rList.set(roomNo-1, true);
				System.out.println(roomNo + "번방에 입실하셨습니다.");
			} else {
				System.out.println(roomNo + "번방은 현재 손님이 있습니다.");
			}
		}else {
			System.out.println("1번부터 10번방까지 준비되어 있습니다.");
		}
	}
	public void checkOut(int roomNo) {
		if(roomNo > 0 && roomNo < 11) {
			Boolean room = rList.get(roomNo-1);
			if(room) {
				rList.set(roomNo-1, false);
				System.out.println(roomNo + "번방에서 퇴실하셨습니다.");
			} else {
				System.out.println(roomNo + "번방은 현재 빈방입니다.");
			}
		}else {
			System.out.println("1번부터 10번방까지 준비되어 있습니다.");
		}
	}
}
