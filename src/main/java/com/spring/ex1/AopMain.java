package com.spring.ex1;

public class AopMain {		//클래스만든 순서 4.

	public static void main(String[] args) {
		
		Board myboard = new Board();
		myboard.board();
		
		System.out.println("-------------------");
		Order myorder = new Order();
		myorder.order();

	}

}
