package com.project2.springjdbcproject2.dao;

import com.project2.springjdbcproject2.exception.ApplicationException;
import com.project2.springjdbcproject2.pojo.UserPojo;

import java.util.List;


public interface AccountDao {
	public List<UserPojo> getAllAccount() throws ApplicationException;
	
	public UserPojo createAccount(UserPojo accountPojo) throws ApplicationException;
	
	UserPojo updateAccount(UserPojo accountPojo) throws ApplicationException;
	
	public void deleteAccount(UserPojo accountPojo) throws ApplicationException;
	
	public UserPojo getOneAccount(UserPojo accountPojo) throws ApplicationException;
	
}