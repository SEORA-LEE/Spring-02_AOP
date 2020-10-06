package com.spring.ex2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopMain {			//9.

	public static void main(String[] args) {
/*
 * ��ü����� �޼��� ȣ���ϱ� --> aopExam.xml�� �غ���
		
		Login li = new Login();
		li.login();							//��� :�α��� ����		--������
		
		OrderImpl myorder = new OrderImpl();
		oi.order();							//��� :��ǰ �ֹ��ϱ�		--�ٽɱ��
		
		Dao d = new Dao();					//��� :DB �۾� ������	--������
		d.dao();
		
		Logout lo = new Logout();			//��� :�α׾ƿ� ����		--������
		lo.logout();
*/		
		
		AbstractApplicationContext context = new GenericXmlApplicationContext("aopExam.xml");
		
		System.out.println("----��ǰ �ֹ��ϱ�-----");
		Order myorder = (Order)context.getBean("myorder");	//myorder��� ���簴ü�� �����Ͷ�
		myorder.order();	//�ٽɱ��							//OrderImpl�� �θ� Order�̹Ƿ� Order�� �޾Ƶ� �ȴ�
		
		
		System.out.println("----�Խù� ����ϱ�-----");
		Board myboard = (Board)context.getBean("myboard");
		myboard.board();	//�ٽɱ��
	}

}
