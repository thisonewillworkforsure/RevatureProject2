package com.project2.springjdbcproject2.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.project2.springjdbcproject2.SpringJdbcProject2Application;
import com.project2.springjdbcproject2.exception.ApplicationException;
import com.project2.springjdbcproject2.pojo.PojoBase;
import com.project2.springjdbcproject2.pojo.UserPojo;


public class AccountDaoUserImp implements AccountDao {

	private static final Logger logger = LoggerFactory.getLogger(SpringJdbcProject2Application.class); 
	
	@Override
	public List<PojoBase> getAllAccount() throws ApplicationException {
		// TODO Auto-generated method stub
		logger.info("Invoking getAllAccount in dao layer");
		try {
			Connection newConnection = DBUtil.makeConnection();
			Statement statement = newConnection.createStatement();

			String queryString = "SELECT account.id,account.first_name,account.last_name,account.password,account.balance,account.user_name FROM account LEFT OUTER JOIN closed_account ON closed_account.account_id = account.id WHERE closed_account.closed_date IS NULL;";
			String actualString = "SELECT * FROM account";
			
			
			
			ResultSet resultSet = statement.executeQuery(queryString);
			List<PojoBase> userPojos = new ArrayList<PojoBase>();

			while (resultSet.next()) {
				UserPojo temPojo = new UserPojo();
				temPojo.setUserID(resultSet.getInt("user_id"));
				temPojo.setStatusID(resultSet.getInt("status_id"));
				temPojo.setTypeID(resultSet.getInt("type_id"));
				temPojo.setUserName(resultSet.getString("user_name"));
				temPojo.setUserName(resultSet.getString("user_password"));
				//userPojos.add((PojoBase)temPojo);
			}
			return userPojos;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new ApplicationException("There was an sql exception, please try again");
		}
	}

	@Override
	public PojoBase createAccount(PojoBase accountPojo) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PojoBase updateAccount(PojoBase accountPojo) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAccount(PojoBase accountPojo) throws ApplicationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PojoBase getOneAccount(PojoBase accountPojo) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

}
