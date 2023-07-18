package com.kh.day17.oop.motel.run;

import java.util.Scanner;

import com.kh.day17.oop.motel.controller.MotelController;
import com.kh.day17.oop.motel.view.MotelView;

public class MotelRun {
	public static void main(String [] args) throws InterruptedException{
		MotelView view = new MotelView();
		MotelController mCont = new MotelController();
		
		end :
		while(true) {
			int choice = view.printMenu();
			int chosenRoom = 0;
			switch(choice) {
			case 1 :
				chosenRoom = view.inputRoomNumber("입실");
				mCont.checkIn(chosenRoom);
				Thread.sleep(500);
				break;
			case 2 :
				chosenRoom = view.inputRoomNumber("퇴실");
				mCont.checkOut(chosenRoom);
				Thread.sleep(500);
				break;
			case 3 :
				mCont.printAllRooms();
				Thread.sleep(500);
				break;
			case 4 :
				System.out.println("프로그램을 종료합니다.");
				break end;
			default :
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				Thread.sleep(500);
				break;
			}
		}
	}
}
