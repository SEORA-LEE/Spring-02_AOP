package com.spring.ex1;

public class Board {		//클래스만든 순서 1.

	public void board() {	//대소문자가 달라, 생성자가 아니다
		
		String msg = "게시물 등록";
		
		Login.login(msg);					//2)핵심기능을 실행하기 전에는 반드시 로그인을 해야한다	
		System.out.println(msg + "하기");		//1)핵심기능이다 :게시물등록하는게 핵심기능이다 
		Logout.logout(msg);					//3) 핵심기능다했으면 로그아웃
		
		
	}//board()메서드
}
