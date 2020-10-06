package com.spring.ex2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopMain {			//9.

	public static void main(String[] args) {
/*
 * 객체만들고 메서드 호출하기 --> aopExam.xml에 해보기
		
		Login li = new Login();
		li.login();							//출력 :로그인 수행		--공통기능
		
		OrderImpl myorder = new OrderImpl();
		oi.order();							//출력 :상품 주문하기		--핵심기능
		
		Dao d = new Dao();					//출력 :DB 작업 수행함	--공통기능
		d.dao();
		
		Logout lo = new Logout();			//출력 :로그아웃 수행		--공통기능
		lo.logout();
*/		
		
		AbstractApplicationContext context = new GenericXmlApplicationContext("aopExam.xml");
		
		System.out.println("----상품 주문하기-----");
		Order myorder = (Order)context.getBean("myorder");	//myorder라고 만든객체를 가져와라
		myorder.order();	//핵심기능							//OrderImpl의 부모가 Order이므로 Order로 받아도 된다
		
		
		System.out.println("----게시물 등록하기-----");
		Board myboard = (Board)context.getBean("myboard");
		myboard.board();	//핵심기능
	}

}
