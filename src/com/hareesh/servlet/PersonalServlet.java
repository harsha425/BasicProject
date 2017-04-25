package com.hareesh.servlet;

import java.io.IOException;
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

@WebServlet("/PersonalServlet")
public class PersonalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session ;

	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	PersonInfo person= new PersonInfo();
	PersonService bo = new PersonServiceImpl();
	 session = request.getSession();
	

		String fname=request.getParameter("fname");	
		String mname=request.getParameter("mname");
		String lname=request.getParameter("lname");
		String gender= request.getParameter("gender");
		
		person.setFirstName(fname);
		person.setLastName(lname);
		person.setMiddleName(mname); 
		person.setGender(gender);
		
		String errors = "";
		
		try{
			bo.insertRecordPersonalInfo(person);    //415-343--6005
		}catch(EmptyException e){
			errors = e.getErrorMessage();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		if(errors.equals("")){
			
			session.setAttribute("allInfo", person);
			response.sendRedirect("/BasicProj/html/ContactInfo.html");
			
		}
		else{
			session.setAttribute("errors", errors);
			response.sendRedirect("/BasicProj/html/PersonalInfo.jsp");
		}
	}
}
//3514e7e316c641cb96fc352190b5cf63

//14b79c33829b4cf6bbf438ada8f604c9
