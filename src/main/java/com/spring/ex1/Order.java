package com.spring.ex1;

public class Order {	//Ŭ�������� ���� 5.
	
	public void order() {	//������X

		String msg = "��ǰ �ֹ�";
		
		Login.login(msg);					//�������̴�	--��� ���� �Ҷ� ����Ƶ� �α����� �ؾ��ϹǷ� �������̴�
		System.out.println(msg + "�ϱ�");		//�ٽɱ��
		Logout.logout(msg);					//�������̴�
		
	}
	

}
