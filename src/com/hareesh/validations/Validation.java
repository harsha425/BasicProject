package com.hareesh.validations;

public class Validation {
	
	public String isFnameEmpty(String s){
		
		if(isEmpty(s)) {
			return ErrorPage.FIRSTNAME;
			}
		else return "";
		
	}
public String isLnameEmpty(String s){
		
		if(isEmpty(s)) {
			return ErrorPage.LASTNAME;
			}
		else return "";
		
	}
public String isMnameEmpty(String s){
	
	if(isEmpty(s)) {
		return ErrorPage.MIDDLENAME;
		}
	else return "";
	
}

public String isGenderEmpty(String s){
	
	if(isEmpty(s)) {
		return ErrorPage.GENDER;
		}
	else return "";
	
}
public String isStreetEmpty(String s){
	
	if(isEmpty(s)) {
		return ErrorPage.STREET;
		}
	else return "";
	
}
public String isAptEmpty(String s){
	
	if(isEmpty(s)) {
		return ErrorPage.APT;
		}
	else return "";
	
}
public String isCityEmpty(String s){
	
	if(isEmpty(s)) {
		return ErrorPage.CITY;
		}
	else return "";
	
}
public String isStateEmpty(String s){
	
	if(isEmpty(s)) {
		return ErrorPage.STATE;
		}
	else return "";
	
}
public String isCountryEmpty(String s){
	
	if(isEmpty(s)) {
		return ErrorPage.COUNTRY;
		}
	else return "";
	
}
public String isSsnEmpty(String s){
	
	if(isEmpty(s)) {
		return ErrorPage.SSN;
		}
	else return "";
}
public String isAccountEmpty(String s){
	
	if(isEmpty(s)) {
		return ErrorPage.ACCOUNT;
		}
	else return "";
}
public String isBankEmpty(String s){
	
	if(isEmpty(s)) {
		return ErrorPage.BANK;
		}
	else return "";
	
}	

public boolean isEmpty (String str ){
	
	
	return str == null || str.isEmpty() || str.equals("") ;
}

}
