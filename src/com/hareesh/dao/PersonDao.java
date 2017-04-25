package com.hareesh.dao;

import java.sql.SQLException;

import com.hareesh.vo.PersonInfo;

public interface PersonDao {

	public void insertRecord(PersonInfo  personInfo) throws ClassNotFoundException, SQLException;
	
	public boolean deleteRecord(String  ssn) throws ClassNotFoundException, SQLException;
	
	public int updateRecord(PersonInfo personInfo) throws ClassNotFoundException, SQLException;
	
	public PersonInfo getRecord(String ssn) throws ClassNotFoundException, SQLException;
	
}

