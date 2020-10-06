package com.spring.ex1;

public class Order {	//클래스만든 순서 5.
	
	public void order() {	//생성자X

		String msg = "상품 주문";
		
		Login.login(msg);					//공통기능이다	--몇가지 일을 할때 어찌됐든 로그인은 해야하므로 공통기능이다
		System.out.println(msg + "하기");		//핵심기능
		Logout.logout(msg);					//공통기능이다
		
	}
	

}
