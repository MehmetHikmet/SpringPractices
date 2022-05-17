package com.springDemo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class CustomerDal implements ICustomerDal{
	@Value("${sqlConnectionString}")
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public void add() {
		System.out.println("Connection String: " +this.connectionString);
		System.out.println("Oracle vt eklendi");
	}

}
