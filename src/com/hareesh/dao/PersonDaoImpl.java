package com.hareesh.dao;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.Synchronization;
import javax.transaction.SystemException;
import javax.transaction.Transaction;
import javax.transaction.xa.XAResource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.hareesh.util.HibernateSessionFactory;
import com.hareesh.vo.PersonInfo;

@Repository
public class PersonDaoImpl   implements PersonDao{
	 PreparedStatement statement=null;
	@Override
	public void insertRecord(PersonInfo personInfo)  throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		HibernateSessionFactory hb = new HibernateSessionFactory();
		SessionFactory sessions=hb.getSessionFactory();
		Session session= sessions.openSession();
	//	Transaction tx = (Transaction) session.beginTransaction();
		 session.beginTransaction();
		    session.save(personInfo);
		    session.getTransaction().commit();
	
		session.close();
	}

	@Override
	public boolean deleteRecord(String ssn) throws ClassNotFoundException, SQLException{
		
		// Connection connection = ConnectionClass.createConnection();
		 
		 
		return false;
	}

	@Override
	public int updateRecord(PersonInfo personInfo) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PersonInfo getRecord(String ssn) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
