package com.project2.springjdbcproject2.controller;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project2.springjdbcproject2.dao.AccountDao;
import com.project2.springjdbcproject2.dao.AccountDaoUserImp;
import com.project2.springjdbcproject2.exception.ApplicationException;
import com.project2.springjdbcproject2.pojo.UserPojo;

@RestController
@RequestMapping("api")
public class ServiceController {

	@GetMapping("bla")
	public List<UserPojo> getAllAccounts() {
		AccountDao accountDao = new AccountDaoUserImp();
		try {
			return accountDao.getAllAccount();
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@PostMapping("")
	public UserPojo addUser(@RequestBody UserPojo userPojo) {
		AccountDao accountDao = new AccountDaoUserImp();
		try {
			return accountDao.createAccount(userPojo);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
