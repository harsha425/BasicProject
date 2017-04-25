package com.hareesh.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hareesh.dao.PersonDao;
import com.hareesh.dao.PersonDaoImpl;
import com.hareesh.validations.EmptyException;
import com.hareesh.validations.Validation;
import com.hareesh.vo.PersonInfo;
//BO     

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	PersonDao db = null;
	
	@Override
	public void insertRecordPersonalInfo(PersonInfo personInfo) throws EmptyException, Exception {

		StringBuffer sbf = new StringBuffer();
		Validation validations = new Validation();
		
		sbf.append(validations.isFnameEmpty(personInfo.getFirstName()));
		sbf.append(validations.isMnameEmpty(personInfo.getMiddleName()));
		sbf.append(validations.isLnameEmpty(personInfo.getLastName()));
		sbf.append(validations.isGenderEmpty(personInfo.getGender()));
		
		if(sbf.length()>0){
			EmptyException e = new EmptyException(sbf.toString());
			throw e;
		}
		
	}

	@Override
	public void insertRecordContactInfo(PersonInfo personInfo) throws EmptyException, Exception {
		// TODO Auto-generated method stub
		
		StringBuffer buffer = new StringBuffer();
		Validation val = new Validation();
		buffer.append(val.isStreetEmpty(personInfo.getStreet()));
		buffer.append(val.isAptEmpty(personInfo.getApt()));
		buffer.append(val.isCityEmpty(personInfo.getCity()));
		buffer.append(val.isStateEmpty(personInfo.getState()));
		buffer.append(val.isCountryEmpty(personInfo.getCountry()));
		
		if(buffer.length()>0){
			
			EmptyException e = new EmptyException(buffer.toString());
			throw e;
		}
	}

	@Override
	public void insertRecordBankInfo(PersonInfo personInfo) throws EmptyException, Exception {
		StringBuffer buffer = new StringBuffer();
		Validation val = new Validation();
		buffer.append(val.isSsnEmpty(personInfo.getSsn()));
		buffer.append(val.isAccountEmpty(personInfo.getAccount()));
		buffer.append(val.isBankEmpty(personInfo.getBank()));
		
		if(buffer.length()>0){
			
			EmptyException e = new EmptyException(buffer.toString());
			throw e;
		}else{
			 db = new PersonDaoImpl();
			db.insertRecord(personInfo);
		}
	}
	@Override
	public boolean deleteRecord(String ssn) throws EmptyException, Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int updateRecord(PersonInfo personInfo) throws EmptyException, Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PersonInfo getRecord(String ssn) throws EmptyException, Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
