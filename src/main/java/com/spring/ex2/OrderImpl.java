package com.spring.ex2;

public class OrderImpl implements Order {	//8.

	
	String msg = "상품 주문";
	@Override
	public void order() {
		
		System.out.println(msg + "하기");		//핵심기능이다 :주문관련 핵심기능이다
		
	}

}
