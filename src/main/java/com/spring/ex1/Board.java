package com.spring.ex1;

public class Board {		//Ŭ�������� ���� 1.

	public void board() {	//��ҹ��ڰ� �޶�, �����ڰ� �ƴϴ�
		
		String msg = "�Խù� ���";
		
		Login.login(msg);					//2)�ٽɱ���� �����ϱ� ������ �ݵ�� �α����� �ؾ��Ѵ�	
		System.out.println(msg + "�ϱ�");		//1)�ٽɱ���̴� :�Խù�����ϴ°� �ٽɱ���̴� 
		Logout.logout(msg);					//3) �ٽɱ�ɴ������� �α׾ƿ�
		
		
	}//board()�޼���
}
