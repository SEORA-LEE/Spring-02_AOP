package com.spring.ex2;

public class OrderImpl implements Order {	//8.

	
	String msg = "��ǰ �ֹ�";
	@Override
	public void order() {
		
		System.out.println(msg + "�ϱ�");		//�ٽɱ���̴� :�ֹ����� �ٽɱ���̴�
		
	}

}
