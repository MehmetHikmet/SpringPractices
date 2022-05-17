package com.springDemo;

import org.springframework.beans.factory.annotation.Value;

public class MysqlCustomerDal implements ICustomerDal {
	
	@Value("${sqlConnectionString}")
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	
	@Override
	public void add() {
		System.out.println("Connection String: " +this.connectionString);
		System.out.println("mysql vt eklendi");
		
	}

}
