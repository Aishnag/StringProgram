package com.aishwarya;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class InsertBankAccount {

DataSource dataSource;
	
	JdbcTemplate jdbcTemplate;
	
	String qry;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	// inserting new bank Account
	void addNewBankAccount(Bank bank) {
		
		
		qry="insert into account values(?,?,?)";
		jdbcTemplate.update(qry,
				             new Object[] {
				            		bank.accountNumber(),
				            		bank.accountName(),
				            		bank.accountBalance()});
	
		}
	
	// get all bank details
	
	Bank getAllBankDetails(Integer accountNumber) {
		qry = "select * from account where accountNumber =? ";
		return jdbcTemplate.queryForObject(qry, new BankMapper() ,new Object[] {accountNumber});
				
	}
//	Create an inner class that implements RowMapper
	class BankMapper implements RowMapper<Bank>{

	@Override
	public Bank mapRow(ResultSet rs, int rowNum) throws SQLException {
		
//		Map the fields of class:Bank with columns of table:Bank 
		Bank theBank = new Bank
				(       rs.getInt("accountNumber"),
						rs.getString("accountName"),
						rs.getDouble("accountBalance"));
		    return theBank;
	}
	
	}}

