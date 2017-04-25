package com.hareesh.bo;

import java.sql.SQLException;

import com.hareesh.validations.EmptyException;
import com.hareesh.vo.PersonInfo;

public interface PersonService {

	public void insertRecordPersonalInfo(PersonInfo  personInfo) throws EmptyException,Exception;
	
	public void insertRecordContactInfo(PersonInfo  personInfo) throws EmptyException,Exception;
	
	public void insertRecordBankInfo(PersonInfo  personInfo) throws EmptyException,Exception;
	
	public boolean deleteRecord(String  ssn) throws EmptyException,Exception ;
	
	public int updateRecord(PersonInfo personInfo) throws EmptyException,Exception;
	
	public PersonInfo getRecord(String ssn) throws EmptyException,Exception;
	
	
	
}
