package com.hareesh.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hareesh.bo.PersonService;
import com.hareesh.bo.PersonServiceImpl;
import com.hareesh.validations.EmptyException;
import com.hareesh.validations.Validation;
import com.hareesh.vo.PersonInfo;

@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	PersonInfo person = (PersonInfo) request.getSession().getAttribute("allInfo");
	
		String street=request.getParameter("street");
		//We can call the methods I guess 
		String  apt=request.getParameter("apt");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		String country= request.getParameter("country");
		person.setStreet(street);
		person.setCity(city);
		person.setCountry(country);
		person.setState(state);
		person.setApt(apt);
		
		String errors = "";
		PersonService bo = new PersonServiceImpl();
		
		try{
			bo.insertRecordContactInfo(person);
		}catch(EmptyException e){
			errors = e.getErrorMessage();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		if(errors.equals("")){
			
			request.getSession().setAttribute("allInfo", person);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/html/BankInfo.html");
			rd.forward(request, response);
		}
		else{
			request.getSession().setAttribute("errors", errors);
			RequestDispatcher rd =  request.getRequestDispatcher("/html/ContactInfo.jsp");
			rd.forward(request, response);
			//response.sendRedirect("/BasicProj/html/ContactInfo.html");
		}
	}
}
