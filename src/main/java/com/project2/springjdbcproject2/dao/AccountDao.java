package com.project2.springjdbcproject2.dao;

import com.project2.springjdbcproject2.exception.ApplicationException;
import com.project2.springjdbcproject2.pojo.PojoBase;

import java.util.List;


public interface AccountDao {
	public List<PojoBase> getAllAccount() throws ApplicationException;
	
	public PojoBase createAccount(PojoBase accountPojo) throws ApplicationException;
	
	PojoBase updateAccount(PojoBase accountPojo) throws ApplicationException;
	
	public void deleteAccount(PojoBase accountPojo) throws ApplicationException;
	
	public PojoBase getOneAccount(PojoBase accountPojo) throws ApplicationException;
	
}