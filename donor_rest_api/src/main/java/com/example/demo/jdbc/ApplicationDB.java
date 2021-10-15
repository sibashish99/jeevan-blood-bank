package com.example.demo.jdbc;

import java.sql.Connection;

public class ApplicationDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(DbConnection.getOracleConnection());
		
		Connection con = DbConnection.getOracleConnection();

	}

}
