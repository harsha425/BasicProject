package com.hareesh.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hareesh.bo.PersonService;
import com.hareesh.bo.PersonServiceImpl;
import com.hareesh.dao.PersonDao;
import com.hareesh.dao.PersonDaoImpl;
import com.hareesh.validations.EmptyException;
import com.hareesh.validations.Validation;
import com.hareesh.vo.PersonInfo;

@WebServlet("/BankServlet")
public class BankServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PersonInfo person = (PersonInfo) request.getSession().getAttribute("allInfo");
	//Validation val = new Validation();
	String ssn=request.getParameter("ssn");
	String  acc=request.getParameter("acc");
	String bank=request.getParameter("bank");
	person.setSsn(ssn);
	person.setAccount(acc);
	person.setBank(bank);
	
	String errors = "";
	PersonService bo = new PersonServiceImpl();
	
	try{
		bo.insertRecordBankInfo(person);
	}catch(EmptyException e){
		errors = e.getErrorMessage();
	}catch(Exception e){
		e.printStackTrace();
	}
	                                           
	if(errors.equals("")){
		
		request.getSession().setAttribute("allInfo", person);
		RequestDispatcher rd = request.getRequestDispatcher("/html/OutputWithJstl.jsp");
		rd.forward(request, response);
	}
	else{
		request.getSession().setAttribute("errors",errors);
		response.sendRedirect("/BasicProj/html/BankInfo.jsp");
		
	}
		
	
	}
}
