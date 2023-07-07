package com.kh.day10.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListRun {
	public static void main(String[] args) {
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		
		for(int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i).toString());
		}
	}
	public void sListExample() {
		List<String> strList = new ArrayList<String>(); // 업캐스팅
		strList.add("딸기");
		strList.add("복숭아");
		strList.add("바나나");
		strList.add("포도");
		
		System.out.println("첫번째 : " + strList.get(0));
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i+1) + "번째 값: " + strList.get(i));
		}
		
		strList.add(2, "체리"); // 중간에 추가 가능
		System.out.println("======================");
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i+1) + "번째 값 : " + strList.get(i));
		}
		
		strList.set(2, "파인애플"); // 수정 가능
		System.out.println("======================");
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i+1) + "번째 값 : " + strList.get(i));
		}
		
		strList.remove(2); // 삭제 가능
		System.out.println("======================");
		for(int i = 0; i < strList.size(); i++) {
			System.out.println((i+1) + "번째 값 : " + strList.get(i));
		}
//		ArrayList<String> aList = new ArrayList<String>();
		
		
	}
	public void genericExample() {
		RList<Integer> list = new RList<Integer>();
		list.add(10);
		list.add(26);
		list.add(923);
		
		int num = list.get(0); // T get에서 자동형변환 이루어짐
		
		System.out.println("num : " + num);
		
	}
	public void objectExample() {
		ObjectList objList = new ObjectList();
		objList.add(10);
		objList.add("월");
		objList.add('A');
		
		Object obj = objList.get(0);
		
		int num = (int)obj;
		// Type mismatch: cannot convert from Object to int
		Object obj2 = objList.get(1);
		String str = (String)obj2;
		// Type mismatch: cannot convert from Object to Strong
		
		char cOne = (char)objList.get(2);
		//// Type mismatch: cannot convert from Object to char
		
	}
	public void intExample() {
//		int [] nums = new int [3];
		IntList nums = new IntList();
//		num[0] = 1;
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
//		int result = nums[0];
		int result = nums.get(0);
		System.out.println("result1 : " + result);
		
//		int size = nums.length;
		int size = nums.size();
		System.out.println("size : " + size);
		
//		nums = {};, nums = new int[3];
		nums.clear();
	}
}
