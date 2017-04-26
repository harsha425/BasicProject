package com.hareesh.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.hareesh.bo.PersonService;
import com.hareesh.bo.PersonServiceImpl;
import com.hareesh.validations.EmptyException;
import com.hareesh.vo.PersonInfo;

@Controller
@SessionAttributes("allInfo")
public class ControllerInfo {
	
	@Autowired
	private PersonService bo = null;
	PersonInfo allinfo;
	
	
	public ControllerInfo(){
		super();
	}
	
	@RequestMapping("/displayFirst.do")
	public String displayFirst(Model model){
		
		System.out.println("Starting of ControllerInfo : displayFirst(Model model)");
		PersonInfo allinfo = new PersonInfo();
		//HttpSession session = request.getSession();
		model.addAttribute("allInfo", allinfo);
		System.out.println("Completed ControllerInfo : displayFirst(Model model)");
		return "PersonalInfo1";
	}
	@RequestMapping( "/personInfo.do")
	public ModelAndView displayContactInfo(@ModelAttribute("allInfo") PersonInfo allinfo){
		System.out.println("Starting of ControllerInfo : displayContactInfo(@ModelAttribute(\"allInfo\") PersonInfo allinfo)");
		String errors = "";
		try{
			bo.insertRecordPersonalInfo(allinfo);
		}catch(EmptyException e){
			errors = e.getErrorMessage();
		}catch(Exception e){
			e.printStackTrace();
		}
		if(!errors.equals("")){
			ModelAndView mv = new ModelAndView("PersonalInfo1");
			mv.addObject("errors", errors);
			//mv.addObject("result", result);
			
			return mv;	
		}
		ModelAndView mv = new ModelAndView("ContactInfo1");
		System.out.println("Completed ControllerInfo : displayContactInfo(@ModelAttribute(\"allInfo\") PersonInfo allinfo)");
		return mv;
	}
	@RequestMapping( "/contactInfo.do")
	public ModelAndView displayBankInfo(@ModelAttribute("allInfo") PersonInfo allinfo){
		System.out.println("Starting of ControllerInfo : displayBankInfo(@ModelAttribute(\"allInfo\") PersonInfo allinfo)");
		String errors = "";
		try{
			bo.insertRecordContactInfo(allinfo);
		}catch(EmptyException e){
			errors = e.getErrorMessage();
		}catch(Exception e){
			e.printStackTrace();
		}
		if(!errors.equals("")){
			ModelAndView mv = new ModelAndView("ContactInfo1");
			mv.addObject("errors", errors);
			return mv;	
		}
		ModelAndView mv = new ModelAndView("BankInfo1");
		System.out.println("Completed ControllerInfo : displayBankInfo(@ModelAttribute(\"allInfo\") PersonInfo allinfo)");
		return mv;
	}
	@RequestMapping(value = "/bankInfo.do")
	public ModelAndView displayOutputInfo(@ModelAttribute("allInfo") PersonInfo allinfo){
		String errors = "";
		try{
			bo.insertRecordBankInfo(allinfo);
		}catch(EmptyException e){
			errors = e.getErrorMessage();
		}catch(Exception e){
			e.printStackTrace();
		}
		if(!errors.equals("")){
			ModelAndView mv = new ModelAndView("BankInfo1");
			mv.addObject("errors", errors);
			return mv;	
		}          
		ModelAndView mv = new ModelAndView("Success");
		return mv;
	}
}
