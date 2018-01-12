package com.codechobo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorld2") //�ܺο��� ������ �� �ִ� �̸�
public class HelloWorld2 extends HttpServlet{ //�����̸�

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("Hello, Servlet.");
		out.println("<br>");
		out.println("X�� �����!!");
		out.println("<br>");
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==j||i+j==4) {
					out.println("*");
				}else {
					out.println("o");
				}			
			}
			out.println("<br>");
		}//X�� ����� ��
		
		int num1 = (int)(Math.random()*6) +1;
		int num2 = (int)(Math.random()*6 )+1;
			
		out.println("<img src='images/dice"+ num1 +".jpg' alt=\"\">");//�̹��� ����ϱ�
		out.println("<img src=\"images/dice"+ num2 +".jpg\" alt=\"\">");//�̹��� ����ϱ�
		
		//�Ȱ�ġ�� �̹��� �������� ��������
		int [] numbers = {1,2,3,4,5,6};
		int temp, randomnumber = 0;
		for(int i=0;i<5;i++) {//10�� ���� ��Ű��
			randomnumber = (int)(Math.random()*6);
			temp = numbers[i];
			numbers[i] = numbers[randomnumber];
			numbers[randomnumber]=temp;
		}	
		out.println("<br>");
		out.println("<img src=\"images/dice"+ numbers[0] +".jpg\" alt=\"\">");//�̹��� ����ϱ�
		out.println("<img src=\"images/dice"+ numbers[1] +".jpg\" alt=\"\">");//�̹��� ����ϱ�
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		doGet(req,resp);//Post��û�� ���͵�  Get���� ó���� �� �ִ�. �׷� ���� Get�� ó���Ѵ�.
	}	
}
